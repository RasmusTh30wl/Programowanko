#### Zadanie 1.

Utwórz wzorzec dekoratora tortów. 

a) Napisz interfejs Cake z dwoma metodami:
  
  - zwracającą koszt tortu,

  - zwracającą składniki tortu.

b) Napisz klasę podstawowy tort implementującą powyższy interfejs.

c) Napisz klasę abstrakcyjną CakeDecorator dziedziczącą po klasie z podpunktu b) składającą się z:

  - chronionego pola klasy Cake,
  
  - konstruktora,
  
  - metod jak w punkcie a), wywołujących stosowne metody obiektu w polu typu Cake.

d) Napisz klasę dziedziczącą po klasie CakeDecorator będącą reprezentacją tortu z truskawkami dziedziczącą po klasie z podpunktu c). Zaimplementuj w niej niezbędne metody.

e) Napisz klasę dziedziczącą po klasie CakeDecorator będącą reprezentacją tortu z czekoladą dziedziczącą po klasie z podpunktu c). Zaimplementuj w niej niezbędne metody.

f) Napisz klasę dziedziczącą po klasie z podpunktu c) będącą reprezentacją tortu z  kremem. Zaimplementuj w niej niezbędne metody.

g) Utwórz polimorficzne obiekty, będące obiektem klasy z punktu b), dekorując je wybranymi obiektami klas z punktów d), e) i f). Przetestuj wielokrotne dekorowanie tego samego obiektu bazowego. Wywołaj metody z punktu a) tych obiektów.
