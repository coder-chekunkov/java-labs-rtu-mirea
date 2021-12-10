## 👨‍🎓📒 Лабораторные работы по дисциплине: "Кроссплатформенная среда исполнения программного обеспечения". РТУ МИРЭА. 

С технической документацией Вы можете ознакомится на страницах Wiki.

--------------------

<a name="contents">

**Оглавление.**

- [Лабораторная работа №1](#lab_1)
- [Лабораторная работа №2](#lab_2)
- [Лабораторная работа №3](#lab_3)
- [Лабораторная работа №4](#lab_4)
- [Лабораторная работа №5](#lab_5)
- [Лабораторная работа №6](#lab_6)
  
</a>

--------------------

<a name="lab_1">
  
### Лабораторная работа №1.
  
Выполнение: :heavy_check_mark:
  
<a name="lab_1_task_1">  
  
**Задание 1.**

Вы - подающий надежды разработчик, которому предстоит написать свою первую игру. 
Обладая базовыми навыками проектирования, вы решили, что начнёте с одного из трёх классов в игре: Персонаж, Противник, Оружие.
Для каждого класса вы описали соответствующее содержание.

Персонаж имеет: имя, очки здоровья, очки опыта, текущий уровень, силу атаки и уровень защиты.
Противник имеет: название, очки здоровья, силу атаки и уровень защиты.
Оружие имеет: название, силу атаки, стоимость, требуемый уровень для персонажа.

По данному описанию реализуйте соответствующие классы и их свойства, выбирая правильные типы переменных, на языке Java.
В любом классе создать один метод, который возвращает любое соответствующее свойство.
Например, в оружие создать метод, который возвращает силу атаки.

</a>
  
<a name="lab_1_task_2">  
  
**Задание 2.**

В классе “персонаж” создать метод, который по полученному значению требуемого уровня оружия проверяет может ли игрок его экипировать (выводит сообщение на экран).

</a>
  
<a name="lab_1_task_3">  
  
**Задание 3.**

Создать два динамических массива: один с объектами типа “Противник”, второй с “Оружие”. 
При помощи цикла for заполнить оба массива десятью объектами со случайными значениями имён и характеристик. 
После чего, при помощи цикла foreach вывести их данные в консоль.
  
</a>
  
:books: [Описание выполнения Лабораторной работы №1.](https://github.com/coder-chekunkov/java-labs-rtu-mirea/wiki/%D0%9B%D0%B0%D0%B1%D0%BE%D1%80%D0%B0%D1%82%D0%BE%D1%80%D0%BD%D0%B0%D1%8F-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%E2%84%96-1.)
  
:pushpin: [Оглавление.](#contents)
  
</a>

------------------------------------------------------

<a name="lab_2">

### Лабораторная работа №2. 
  
Выполнение: :heavy_check_mark:

<a name="lab_2_task_1">  
  
**Задание 1.**

Теперь вы - подкованный разработчик и вас не испугать словами инкапсуляция или полиморфизм. Время проверить свои навыки на
прочность. 

Задание состоит в следующем: Необходимо реализовать иерархию классов, относящихся к игровым сущностям. 
Вы знаете из предыдущей работы, что монстры, экипировка и другие классы сущностей имеют некоторые общие свойства
и решаете объединить их в одном базовом классе, чтобы расширять его конкретными классами (например, существо или предмет).
Вы решаете для наглядности нарисовать итоговую диаграмму классов в одной из программ (Miro, draw.io, Visio…).

</a>
  
<a name="lab_2_task_2">  
  
**Задание 2.**

Вы хорошо потрудились и спроектировали хорошую (хорошую ведь?) иерархию классов. Теперь необходимо реализовать её в коде.

Дополнительно вы решаете перевести методы расчёта DPS и получения урона персонажем в статический класс GameLogic, который
изначально не изображали на иерархии, но после добавления обновили схему.
Для тестирования вы создали игровой цикл с несколькими объектами типа оружия, существ и героя. Герой получает оружие и для
него рассчитывается DPS, монстры так же получают своё оружие с аналогичной логикой и дальше идёт обмен уроном.

</a>  

<a name="lab_2_task_3">    
  
**Задание 3.**

Разобравшись с базовой иерархией, вы решили сделать заготовку для “магической” системы. По задумке, персонаж обладает магией стихий
и может атаковать врагов снарядами разных стихий. Чтобы правильно реализовать задуманное, необходимо создать интерфейс стихий, который
будет реализовываться различными способами для огня, воздуха, воды, мороза, земли и эфира. Заклинание снаряда имеет обобщенный тип,
который ограничивается стихиями. И наконец персонаж использует три слота под заклинание с любыми стихиями.

</a>  
  
:books: [Описание выполнения Лабораторной работы №2.](https://github.com/coder-chekunkov/java-labs-rtu-mirea/wiki/%D0%9B%D0%B0%D0%B1%D0%BE%D1%80%D0%B0%D1%82%D0%BE%D1%80%D0%BD%D0%B0%D1%8F-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%E2%84%96-2.)
  
:pushpin: [Оглавление.](#contents)
  
</a>

------------------------------------------------------

<a name="lab_3">

### Лабораторная работа №3. 
  
Выполнение: :x:

<a name="lab_3_task_1">  
  
**Задание 1.**

Настало время экспериментов! Создание игр подчиняется старой схеме, позаимствованной у великих иллюзионистов - дым и зеркала. И для
придания иллюзии “живой” игры, необходимо сделать так, чтобы некоторые действия происходили параллельно, пока игрок продвигается по
миру. А значит стоит задача внедрить многопоточность.

Для начала имеет смысл заселить игру существами, которые могут передвигаться независимо от действий пользователя.

Класс Creature описывает общее живое существо, у которого есть имя, здоровье, экипировка и базовая сила атаки (по-умолчанию равна
1 или случ.значению). Экипировка описывается классом Equipment и у каждого существа есть список (ArrayList<Equipment>) с объектами этого
класса. Во время сражения, сила атаки существа рассчитывается через DPS.
  
Для управления существом как отдельным потоком выполнения используется класс CreatureController, реализующий интерфейс
Runnable, который содержит в себе объект с ссылкой на конкретное существо и позволяет ему существовать в отдельном потоке, пока тот жив.  

Что может делать существо в своём потоке: ожидать появление игрока и драться с игроком.
  
В качестве простейшего игрового пространства можно использовать двумерный массив символов Char[][], где игрок может
отображаться символом “@”, а существа - первой буквой своего имени.
  
Чтобы удобно было ориентироваться в пространстве, имеет смысл использовать класс Position, с полями x, y, а также дополнительными
методами работы с ним.
  
Что необходимо сделать в задании (с учётом условий выше):
  1. Иерархию игровых объектов, начиная с GameObject и
заканчивая Weapon и Mob;
  2. Класс GameLogic со статическими методами для обработки
различных игровых систем (DPS, бой, генерация оружия и т.д);
  3. Игровое поле в виде 2D массива символов, где каждый объект
имеет свою позицию;
  4. Каждый противник использует свой контроллер для работы в
отдельном потоке. Как только враг натыкается на игрока, то
происходит битва. Также каждое существо обладает своей
экипировкой (оружие и броня в виде объектов);
  5. Персонаж игрока автоматически путешествует по игровому
полю и автоматически сражается с противником. Если оружие
или броня убитого противника лучше чем то, что носит игрок,
то оно заменяет текущее;
  6. Игровой цикл, который выполняется, пока игрок жив или пока
не убиты все мобы на карте.
  
Способ генерации игровых переменных - рандомизация.

</a>
  
<a name="lab_3_task_2">  
  
**Задание 2.**
  
Добавить автоматическое исцеление при помощи зелья. Зелья - это отдельный объект класса Potion. Персонаж игрока может подобрать
зелье из убитого противника. Решение о принятии зелья должно основываться на показателях здоровья, которые считываются каждые
несколько секунд.
  
</a>
  
<a name="lab_3_task_3">
  
**Задание 3.**
  
Реализовать задание 2*, а также “базу” на которую персонаж возвращается после убийства всех мобов на карте. С базы игрок может
уйти в автоматическую экспедицию, которая может принести одно из случайно сгенерированных вещей: оружие, броню, зелье.
Либо игрок вновь попадает на игровое поле с врагами.
  
</a>  
  
:pushpin: [Оглавление.](#contents)
  
</a>
  
------------------------------------------------------
  
<a name="lab_4">
  
### Лабораторная работа №4. 
  
Выполнение: :heavy_check_mark:
  
<a name="lab_4_task_1">
  
**Задание 1.**
  
  Описать структуру данных класса Worker (работник) некой
компании со следующими свойствами:
  
- Имя (отдельное поле)
- Фамилия (отдельное поле)
- Возраст
- Пол
- Имя кота (если есть)
- Название отдела
- Должность
- Зарплата
- Премия (если есть)
- Длительность работы в компании (в годах)
  
После чего создать динамический массив из объектов данного класса, и
заполнить не менее 15-20 элементами (все свойства можно задавать рандомом).
  
</a>

<a name="lab_4_task_2">  
   
**Задание 2.**  
  
С имеющейся коллекцией объектов, при помощи методов Stream
API (аналог LINQ в C#) произвести следующие действия:
  
- Вывести работника с максимальной зп среди всех; 
- Вывести работника с минимальной зп среди всех;
- Сортировать работников по возрасту, выбрать только тех, у
кого он меньше 50. Вывести на экран тех, у кого есть кот;
- Тоже самое, что в (c), но убрать из выборки всех, у кого
меньше 50;
- Произвести выборку работников по одному отделу и для
всех изменить премию умножив её значение (если она
больше 0) на 2. Выборку собрать в коллекцию List и
вывести на экран;
- Найти работника со значением суммы зарплаты + премии
больше или равно 100к, вывод функции .get() произвести в
объект класса Optional<Character>. Если такой объект
существует, то вывести на экран его и добавить после
суммы зарплаты+премии текст “наносек”. Если такого
объекта нет, вывести на экран “Компания нищебродов”);
- Посчитать для каждого отдела количество работников.
Вывести на экран в виде таблички.
  
</a>
  
:books: [Описание выполнения Лабораторной работы №4.](https://github.com/coder-chekunkov/java-labs-rtu-mirea/wiki/%D0%9B%D0%B0%D0%B1%D0%BE%D1%80%D0%B0%D1%82%D0%BE%D1%80%D0%BD%D0%B0%D1%8F-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%E2%84%96-4.)
  
:pushpin: [Оглавление.](#contents)
  
</a>  
  
----------------------------
  
<a name="lab_5">  

### Лабораторная работа №5. 
  
Выполнение: :heavy_check_mark:
  
<a name="lab_5_task_1">
  
**Задание 1.**
  
Написать программу в которой бы обратывались следующие исключения:

1. ArrayOutOfBoundsException;
2. IO Exception;
3. InterruptedException;
4. NullPointerException (не через try-catch);
5. Одно произвольно выбранное исключение.
  
Тематики программ на выбор:

1. Игровой проект (можно взять из прошлых практик);
2. “База данных” кошатников;
3. Симуляция майнинга (или любой другой добычи ресурсов на фоне);
4. Симулятор открытия кейсов (лутбоксов/гачи);
5. Симуляция работы офиса в компании.

</a>
  
:books: [Описание выполнения Лабораторной работы №5.](https://github.com/coder-chekunkov/java-labs-rtu-mirea/wiki/%D0%9B%D0%B0%D0%B1%D0%BE%D1%80%D0%B0%D1%82%D0%BE%D1%80%D0%BD%D0%B0%D1%8F-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%E2%84%96-5.)
  
:pushpin: [Оглавление.](#contents)
  
</a>
  
--------------------------
  
<a name="lab_6">    

### Лабораторная работа №6. 
  
Выполнение: :heavy_check_mark:
  
<a name="lab_6_task_1">
  
**Задание 1.**

Написать программу, в которой обрабатываются личные данные сотрудников
некой компании. Сотрудники получают зарплату в конце месяца с учётом выполненных
заданий. Каждое задание занимает N часов работы. Соответственно гонорар за
выполненный таск рассчитывается с учётом занимаемых часов. (формулу можете
придумать сами).
Программа должна содержать следующие функции:
   
- Ввод нового сотрудника вручную; 
- Добавление сотрудника из случайных данных: Отдельные три массива имён, фамилий и отчества откуда
  формируется ФИО; Дата рождения; Массив должностей (без генерального директора и т.п); Город проживания; Список заданий (тоже формируются случайным образом).
- Добавление заданий;
- Просмотр списка выполненных и открытых заданий;
- Вывод топ-3 сотрудников по выполнению заданий в месяц; 
- Вывод задания с наибольшим гонораром за выполнение;
- Формирование отчёта о выполненных заданиях за месяц и сохранение его в текстовый файл;
- Сохранение списка сотрудников в файл;
- Желательно, чтобы текст не был однотонным (но в меру! “Вырвиглазное”
оформление считается за невыполненную работу);

С учётом вышеописанного, программа должна содержать примерно следующие классы:
  
1. Employer - Сотрудник;
2. Task - Задача;
3. View - Всё, что связано с выводом на экран;
4. Report - Класс, в котором формируется отчёт;
5. Log - логирование действий в программе (см. раздел “общие требования”);
6. SaveLoadEmployer - Класс для сохранения и загрузки списка сотрудников;
7. FinanceVariables - коэффициенты для рассчёта зарплаты (стоимость таска, например);
8. GenerateLogic - класс со статическими методами для случайно генерации сотрудника;
9. MainMenu - класс для взаимодействия пользователя с программой.

Для ясности, каждый сотрудник, помимо личной информации, содержит список
задач (объектов класса Task), а его зарплата за месяц вычисляется из данных по
выполненным задачам из этого списка. Сама задача состоит из полей: название, кол-во
часов для выполнения, суть, гонорар за выполнение, статус (закрыта/открыта), кому
назначена (объект класса Employer).
  
</a>
  
:books: [Описание выполнения Лабораторной работы №6.](https://github.com/coder-chekunkov/java-labs-rtu-mirea/wiki/%D0%9B%D0%B0%D0%B1%D0%BE%D1%80%D0%B0%D1%82%D0%BE%D1%80%D0%BD%D0%B0%D1%8F-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%E2%84%96-6.)
  
:pushpin: [Оглавление.](#contents)
  
</a>

--------------------------
