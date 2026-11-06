# pedidos-service

Microservicio de la actividad Arepa Express (DOSW 1, semana 14). Recibe pedidos en `POST /pedidos`, responde con el id del pedido y el estado `RECIBIDO`, y publica el evento `pedido.creado` en el exchange `arepas.eventos` de RabbitMQ.

Está organizado en arquitectura hexagonal: el caso de uso `CrearPedidoUseCase` es el puerto de entrada y `PedidoEventPublisher` es el puerto de salida, implementado por el adaptador de RabbitMQ.

En Azure se publica detrás del API Gateway (Azure API Management) con el prefijo `pedidos-api`.

**Autor:** Juan Nicolás Álvarez Muñoz
