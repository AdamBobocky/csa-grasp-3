# Computer Science A assignement, Unit 3 GRASP task

# Authors: Adam Bobocky and Vojtech Kolomaznik @ LEAF Academy

## The assignement:
GRASPS Unit3 Standard classes: Library management system 1.0

Goal

Program a library management system 1.0

Role

You are a developer who cooperate in couples. (You work in pairs).

Everyone is writing some part of code. Everyone understands partner’s part and participate in presentation in the end.

Audience

School, City

Situation

A organization needs to set a librarian system. They need to see how it will work. Let’s help them to see how the system could work. Opt one of two types that suits you most. Both options are covering all required actions for later production. Option A is simplistic working solution ready for Alpha testing. Option B is Beta testing/simulation with more users and books. Use array and randomization, reading CSV files if you want.

Option A) desing library as it is suggested below. (Alpha testing) 1.0

Option B) desing library as dynamic system using Arrays/ArrayLists. Use randomization to generate more users and books. (Beta testing) 2.0

Product

✔️ Task 1:

✔️ - Create two readers in Library. And create two books.

✔️ - Set a date (format:dd mm yyyy) to 5 5 2020

✔️ - Print all Libraty fields in readable format

✔️ Task 2:

✔️ - Borrow book1 to reader1

✔️ - Borrow book2 to reader2

✔️ - Check fines

✔️ - change current date to 5 6 2020;

✔️ Task 3:

✔️ - Reader1 Returns book1

✔️ - Check fines

✔️ - Change current date to 6 7 2020;

✔️ - Print all Libraty fields in readable format

✔️ Task 4:

✔️ - Reader2 Returns book2

✔️ - Check fines

Constrains

- All fields are private unless necessary to be visible out of class.

- If something is undefined and you need it, use your creativity and make it up.

Suggested Library structure

Class Library

- Fields:

o name (String)

o book1 type Book

o book2 type Book

o reader1 type Reader

o reader2 type Reader

o dateToday type Date

- Methods:

o setTodayDate() sets dateToday

o getTodayDate() returns dateToday

o searchBook(title) use overloading, prints first book with matched title

o searchBook(bookID) use overloading, prints first book with matched id

o setReaders(Reader1, Reader2) sets reader1, reader2

o setBooks(Book1, Book2) sets book1, book2

o checkReaders() prints Readers and their fines if any

o checkFines(DateReturned, DateExpected) returns a fine integer

§ use Book.expected to compare with Library.todayDate as follows

For simplicity you can assume that month has 30 days and year has 365 days

1. If the book is returned on or before the expected return date, no fine will be charged

2. If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, 15x number of late days in coins

3. If the book is returned after the expected return month but still within the same calendar year as the expected return date, fine is 500 x number of late months in coins

4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 coins

Class Book

- Fields:

o Title string

o id int (id>1)

o isbn – use previously made methods (random string in ISBN10 format) isbn==10 chars

o isBorrowed type boolean (true if is borrowed, false means book is in the library)

o borrower type Reader

o dateExpected type Date

- Book (ID,Title,ISBN)

- Methods:

o get(Reader) set isBorrowed to TRUE, set dateExpected to currentDate+1 month

o return() set isBorrowed to FALSE, set dateExpected=null;

o expected() returns Date

Class Reader

- Fields:

o Name (String),

o Email (String),

o ID (int positive number >0)

- Methods:

Class Date

- Fields:

o Day Constrains: 1 .. 30

o Month Constrains: 1 .. 12

o Year Constrains: 1900 .. 2030

- Date(Day,Month,Year)

- Methods:

o getDay returns Day

o getMonth returns Month

o getYear returns Year

Standards/Criteria

- Working cooperation in pairs, equal division of tasks, support of each other. Clear division of roles. If there is one person alone, he will join some other team. Only one team has three persons…

- Source code and project documentation available on Github. Found structure of project doc in previous GRASP

- Interactivity of application via keyboard or mouse

- Output to console or GUI

- Each function is in separate method

- Source code contains comments describing main parts

- Program involves: loops, conditions, variables; arithmetic, relational, logical, and assignment operators;

- Working solution covers all working subtasks

- Program can be extended later by adding another function easily

- Project is considered as succesfully delivered, and you earn points only if all above points are met
