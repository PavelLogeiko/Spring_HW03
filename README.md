## Фреймворк Spring (семинары)
### Урок 3. Использование Spring для разработки серверного приложения

Задание: Используя Spring, создайте серверное REST приложение. 
Добавить функционал в приложение разработанное на семинаре:

____ Проверка работы_____

Для теcтирования проекта использовать программу PostMan:

a) Добавление пользователя - запрос :

метод - POST

адрес - http://localhost:8080/user/body

тело -

{

"name":"Artur",

"age":23,

"email":"exam1@yandex.ru"

}

b) Получение списка пользователей на сервере - запрос:

метод - GET

адрес - http://localhost:8080/user

c) Проверка сортировки - запрос:

метод - GET

адрес - http://localhost:8080/tasks/sort

d) Проверка фильтрации - запрос:

метод - GET

адрес - http://localhost:8080/tasks/filter/23

e) Проверка среднего арифметического - запрос:

метод - GET

адрес - http://localhost:8080/tasks/calc


_____ Конец _____

Базовое задание
1) В класс RegistrationService добавить поля UserService, NotificationService(добавить в IOC контейнер аннотацией @Autowired или через конструктор класса)
2) Разработать метод processRegistration в котором:
- создается пользователь из параметров метода
- созданный пользователь добавляется в репозиторий
- через notificationService выводится сообщение в консоль
3) В TaskController добавить обработчики filterUsersByAge() и calculateAverageAge
4) В методе filterUsersByAge параметр age получать через аннотацию @PathVariable

### Скрины работы приложения:

Список задач

![1]()

Добавление пользователей
![2]()
![3]()
![4]()

Получение списка пользователей на сервере
![5]()

Проверка сортировки
![5]()

Проверка фильтрации
![6]()

Проверка среднего арифметического
![7]()

Получение списка задач
![8]()











