# Programación Orientado a Eventos

### Concepto de evento
- Un evento es resultado de la ejecución de una acci&oacute;n dentro de un entorno gr&aacute;fico.
- Los eventos son objetos. En una ventana, los eventos representan el hacer click sobre un bot&oacute;n, el movimiento del rat&oacute;n, la captura de texto en un campo, etc.
- Cualquier interfaz gr&aacute;fica constantemente monitoriza los eventos en el sistema. La interfaz informa de estos eventos a los programas que se est&aacute;n ejecutando. Cada programa determina que hay que hacer, si es que hay que hacer algo en respuesta a esos eventos.

### Esquema del manejo de eventos
Para el manejo de eventos se requiere de un esquema compuesto por objetos:
- **Objeto origen de los eventos**: Son los componentes gr&aacute;ficos (botones, opciones de men&uacute;, cuadros de texto, etc) con los cuales interactu&aacute; el usuario.
Al efectuar una acci&oacute;n sobre el objeto (dar click, dar enter, etc), se crea (dispara) un objeto que encapsula dicha acci&oacute;n.
- **Objeto evento**: Es el objeto que encapsula la informaci&oacute;n relacionada al objeto que origin&oacute; su creaci&oacute;n (su nombre, por ejemplo), as&iacute; como a la acci&oacute;n realizada.
- **Objeto oyente de los eventos**: Estos objetos tienen la funci&oacute; de "estar atentos escuchando" si se dispara un evento. Cuando un evento se dispara y es "escuchado" por el oyente, este puede ejecutar alguna acción asociada al evento.

Debido a que en una interfaz gr&aacute;fica pueden coexistir varios componentes gr&aacute;ficos que pueden disparar eventos, tambi&eacute;n puede existir varios oyentes con funciones bien delimitadas.

Por lo anterior es muy importante asociar a cada origen su correspondiente oyente. Esta operaci&oacute;n se conoce como "registro del oyente al origen". Es claro que un oyente puede ser registrado a uno o varios componentes.
[![Oyente Eventos](https://i.ibb.co/wL6TdTK/poe.png "Oyente Eventos")](https://i.ibb.co/wL6TdTK/poe.png "Oyente Eventos")

------------

## Manejo de eventos generados por componentes gráficos
Clases necesarias para un ejemplo simple de manejo de eventos de Bot&oacute;n
[![Clases](https://i.ibb.co/jJFQN73/poe-02.png "Clases")](https://i.ibb.co/jJFQN73/poe-02.png "Clases")

