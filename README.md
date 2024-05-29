# Diesel microservice

Микросервисный проект использующий два хранилища и веб клиент.


**Содержит модули:**
* storage - первый склад товаров.
* storage-2 - второй склад товаров.
* web-client - модуль ответственный за web часть приложения.
* eureka-server - сервер регистрации микросервисов
* api-gateway - сервис маршрутизации запросов к микросервисам.

**Описание приложения**

Api со складами товаров и Api Gateway регистрируются на eureka-server.

Веб-клиент осуществляет запросы к удаленным Api для получения списка товаров 
хранящихся на данных Api. Для упрощения запросов используется Openfeign,
который осуществляет запросы к Api Gateway.

Веб клиент формирует динамическое представление в виде двух таблиц, которые 
содержат товары от удаленных Api. 

Благодарю за внимание!