create or replace PACKAGE PAQUETE_PEDIDO AS
    PROCEDURE CREAR_PEDIDO(n_documento PEDIDO.N_DOCUMENTO_CLIENTE%TYPE, condicion PEDIDO.CONDICION_PAGO%TYPE, nro_comprobante PEDIDO.N_COMPROBANTE%TYPE);
    PROCEDURE REGISTRAR_PRODUCTOS(n_documento PEDIDO.N_DOCUMENTO_CLIENTE%TYPE, cantidad PEDIDO_PRODUCTO.CANTIDAD%TYPE, codigo_pro PRODUCTO.COD_PRODUCTO%TYPE);
    PROCEDURE ACTUALIZAR_PRECIO(descuento PEDIDO.DESCUENTO_TOTAL%TYPE);
END PAQUETE_PEDIDO;

create or replace PACKAGE BODY PAQUETE_PEDIDO AS
    -- Crear pedido base (sin total de venta)
    PROCEDURE CREAR_PEDIDO(n_documento PEDIDO.N_DOCUMENTO_CLIENTE%TYPE, condicion PEDIDO.CONDICION_PAGO%TYPE, nro_comprobante PEDIDO.N_COMPROBANTE%TYPE)
    AS
        n_pedido PEDIDO.N_PEDIDO%TYPE := SEQ_PEDIDO.NEXTVAL;
        precio_producto PRODUCTO.VALOR_VENTA%TYPE;
        fecha DATE := SYSDATE;
        cod_vendedor PEDIDO.COD_VENDEDOR%TYPE := 100001;
    BEGIN

        INSERT INTO PEDIDO VALUES (n_pedido, n_documento, cod_vendedor, condicion, nro_comprobante, 0, 0, fecha);
    END CREAR_PEDIDO;

    -- Indicar los productos del pedido
    PROCEDURE REGISTRAR_PRODUCTOS(n_documento PEDIDO.N_DOCUMENTO_CLIENTE%TYPE, cantidad PEDIDO_PRODUCTO.CANTIDAD%TYPE, codigo_pro PRODUCTO.COD_PRODUCTO%TYPE)
    AS
        n_pedido PEDIDO.N_PEDIDO%TYPE := SEQ_PEDIDO.CURRVAL;
    BEGIN
        INSERT INTO PEDIDO_PRODUCTO VALUES (n_pedido, n_documento, codigo_pro, cantidad);
    END REGISTRAR_PRODUCTOS;

    -- Actualizar el pedido con el total de venta
    PROCEDURE ACTUALIZAR_PRECIO(descuento PEDIDO.DESCUENTO_TOTAL%TYPE)
    AS
        total_venta PEDIDO.TOTAL_VALOR_VENTA%TYPE;
        numero_pedido PEDIDO.N_PEDIDO%TYPE := SEQ_PEDIDO.CURRVAL;
    BEGIN
        SELECT ROUND(SUM(PP.CANTIDAD * P.VALOR_VENTA), 2) AS PRECIO_TOTAL
        INTO total_venta
        FROM PEDIDO_PRODUCTO PP, PRODUCTO P 
        WHERE PP.COD_PRODUCTO = P.COD_PRODUCTO
        AND PP.N_PEDIDO = numero_pedido;

        total_venta := total_venta - (total_venta * descuento);

        UPDATE PEDIDO SET TOTAL_VALOR_VENTA = total_venta, DESCUENTO_TOTAL = descuento WHERE N_PEDIDO = numero_pedido;
    END ACTUALIZAR_PRECIO;
END PAQUETE_PEDIDO;  