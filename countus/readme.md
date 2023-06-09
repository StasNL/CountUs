# _Приложение по учёту классов в школе._

### _Описание._

Запуск производится по адресу: localhost:8080

Объекты учёта: Ученики, Учителя, Классы.

Соответствующая таблица открывается нажатием на ссылку с названием объекта.

Возможные действия над объектами: добавление, размножение, удаление.

Добавление объектов осуществляется кнопкой над таблицей.
Размножение и удаление объектов - нажатием на кнопку из выпадающего меню в правой колонке таблицы.

Добавление учеников и учетилей в класс можно выполнить двумя способами:

1. На странице ученика/учителя в выпадающем меню справа нажать кнопку "Добавить в класс" или 
"Сделать классным руководителем".
Произойдёт переход в таблицу классов. Выбрав нужный класс, нужно нажать справа на кнопку "Добавить ученика" или 
"Добавить/заменить учителя". После этого объект добавляется в класс и происходит переход в соответствующую таблицу.

2. На странице класса в выпадающем меню справа нажать кнопку "Добавить ученика" или "Добавить/заменить учителя".
Произойдёт переход в соответствующую таблицу, где, выбрав нужного кандидата, справа нажать кнопку "Добавить в класс"
или "Сделать классным руководителем".

В каждом классе может быть только один классный руководитель и каждый учитель может быть руководителем только 
в одном классе.
При добавлении нового классного руководителя, прошлый заменяется и остаётся без классного руководства.

В таблице классов в графе "Классный руководитель" выводится полное имя классного руководителя.
Кликнув на него, получаем подробную информацию об учителе.

В графе "Ученики", кликнув по ссылке "Список учеников", происходит переход в соответствующую таблицу.
На данной странице можно добавить нового ученика кнопкой вверху аналогично тому, как это происходит при нажатии
в таблице классов, так и удалить ученика из класса кнопкой справа.

Удаление учителя из класса происходит только из выпадающего меню в таблице классов.

При удалении класса содержащиеся в нём ученики и учителя не удаляются из общего списка.
При размножении класса содержащиеся в нём учителя и ученики не переносятся.

Все таблицы сортируются по всем полям. Для этого надо нажать на заголовок соответствующей колонки таблицы.
При повторном нажатии произойдёт обратная сортировка. В случае смены колонки сортировка всегда происходит 
в прямом порядке.
Во всех таблицах осуществляется поиск по всем полям. Для этого нужно вбить в поле поиска требуемое слово или цифру
и нажать "Старт".
Поиск не зависит от регистра и слово может быть неполным.

### _Использованные технологии:_

Spring Boot, Maven, Hibernate, Thymeleaf, Bootstrap, Lombok.
База данных: PostgreSQL.