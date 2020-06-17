## Zajęcia 15

---

#### Zadanie 1

W pewnym szpitalu dokumentacja pomiarów temperatury pacjentów zapisywana była w systemie, który tworzył pliki tekstowe. Każdy plik posiadał nazwę w postaci daty w formacie YYYY.MM.DD. Każdy wiersz takiego pliku zawierał: imię i nazwisko pacjenta oraz oraz dwa pomiary temperatury: poranny i wieczorny. Niestety, dysk na którym te pliki zostały zapisane uległ awarii. Pliki udało się odzyskać, jednak nazwy części z nich zostały utracone.

 

Dany jest katalog zawierający pliki tekstowe zawierający pliki z danymi według podanego wzorca. Jeżeli nazwa pliku nie zawiera daty odpowiadającej formatowi YYYY.MM.DD, należy uznać, że nazwa ta została utracona.

 

Zakładamy, że pacjenci przebywali w szpitalu bez przerw, oraz że ich nazwiska nie powtarzają się. Odzyskiwanie dat należy oprzeć o istnienie lub brak wpisów pacjentów w plikach.

 

Napisz klasę do odzyskania danych o datach oraz wyświetlania informacji o pacjentach. Sposób rozwiązania problemu wewnątrz klasy jest do samodzielnego zaprojektowania. Klasa powinna posiadać:

- publiczną metodę populate, przyjmującą jako argument nazwę katalogu. Metoda powinna zwrócić prawdę, jeżeli udało się ustalić daty wszystkich plików, a fałsz w przeciwnym przypadku

- publiczną metodę patient, przyjmującą imię i nazwisko pacjenta, zwracający obiekt wartościowy zawierający:

  - imię i nazwisko,

  - mapę, której kluczem jest data, a wartością tablica dwuelementowa liczb zmiennoprzecinkowych zawierająca poranny i wieczorny pomiar temperatury.

Jeżeli dowolnego dnia z historii tego pacjenta nie udało się jednoznacznie określić należy zwrócić null. Jeżeli udało się jednoznacznie zrekonstruować historię pomiarów pacjenta, należy zwrócić obiekt nie będący nullem, nawet jeżeli historia innych pacjentów nie jest pełna.

- publiczną, statyczną metodę show, przyjmującą ten obiekt wartościowy i wyświetlający jego zawartość na standardowym wyjściu w taki sposób, że w kolejnych wierszach znajdują się daty oraz dwa pomiary temperatur. Daty w wierszach powinny być posortowane rosnąco.

---
