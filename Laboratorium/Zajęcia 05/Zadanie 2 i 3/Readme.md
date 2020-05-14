#### Zadanie 2.

Napisz klasę Animal modelującą populację zwierząt na danym obszarze, posiadającą prywatne pola:

  - gatunek zwierzęcia będącą osobnym typem Enum - zdefiniuj niezbędne jej elementy,
  
  - wiek oraz maksymalny wiek typu int,

  - płeć, jako wartość logiczną,

  - niezbędne gettery,

  - dwa publiczne konstruktory:
  
    - przyjmujący nazwę, płeć, aktualny wiek, oraz maksymalny wiek - modelujący przybycie nowego osobnika.
  
    - przyjmujący gatunek, losujący maksymalny wiek z przedziału 1-10, modelujący narodziny nowego osobnika.
  
Oba konstruktory powinny informować o utworzeniu nowego obiektu. 

Należy napisać metodę zwiększającą wiek o 1, zwracającą fałsz, jeżeli zwierzę osiągnie maksymalny wiek, a prawdę w przeciwnym przypadku. Należy wyświetlić informację o umierającym osobniku.

---

#### Zadanie 3.

Napisz klasę Ecosystem. Ma ona posiadać:

  - prywatną tablicę obiektów typu Animal,
  
  - konstruktor przyjmujący tablice obiektów klasy Animal,
  
  - publiczną metodę wyświetlającą informację o wszystkich zwierzętach,
  
  - publiczną metodę zwiększającą wiek wszystkich zwierząt o 1. Należy usunąć umierające zwierzę z tablicy.
  
  - Co tok zwierzęta tego samego gatunku, starsze niż rok, łączą się w pary (za każdym razem nowe). Każdej parze w kolejnym roku urodzi się młode. (Na przykład 5 samców i 3 samice stworzy 3 pary i w kolejnym roku w populacji pojawią się 3 młode.)
  
---
