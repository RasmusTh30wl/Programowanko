## Zajęcia 14

---

#### Zadanie 1.
Napisz czat sieciowy obejmujący aplikację klienta i serwer. Serwer podczas ładowania powinien wczytać plik, w którym w kolejnych wierszach znajdować się będą: identyfikator użytkownika oraz jego hasło
Serwer powinien nasłuchiwać na wybranym porcie i oczekiwać komend:

- $login użytkownik hasło, próba zalogowania - dane porównywane są z plikiem. Jeżeli dane są niepoprawne, socket klienta zostaje zamknięty.

Pozostałe komendy dostępne są po zalogowaniu:

- $broadcast nadawca wiadomość - rozsyła napis zawierający nadawcę, czas wysłania oraz wiadomość wszystkim podłączonym użytkownikom,
- $send nadawca odbiorca wiadomość - wysyła odbiorcy i nadawcy napis zawierający nadawcę, czas wysłania i wiadomość.
W przypadku dołączenia lub odłączenia użytkownika do czatu, rozesłać informację o tym wszystkim podłączonym użytkownikom.

---

#### Zadanie 2.
Do serwera z zadania 1 dodaj komendę:

- $history zwracającą historię rozmów na głównym kanale od uruchomienia czatu

Zmodyfikuj serwer w taki sposób, że jeżeli adresat komendy $send nie jest aktualnie zalogowany, to wiadomość dla niego zostanie zapamiętana i wysłana w momencie jego dołączenia

---

#### Zadanie 3.
Napisz serwer sieciowy, który będzie kompresował i wysyłał wybrane pliki. Serwer powinien nasłuchiwać na wybranym porcie i oczekiwać komend:

- $clear - czyści tymczasową listę plików. Odpowiedź: zawsze $ok.
- $add path, gdzie path jest bezwzględną ścieżką - dodaje ścieżkę (plik lub katalog) do tymczasowej listy. Odpowiedź $ok, jeżeli plik dodano do listy, $error, jeżeli plik nie istnieje lub już jest dodany do listy.
- $remove - usuwa plik z listy. Odpowiedź $ok, jeżeli plik usunięto z listy, $error, jeżeli pliku nie było na liście,
- $get - kompresuje pliki z listy do jednego pliku zip i wysyła go. Odpowiedź wieloetapowa: $ok rozmiar, gdzie podawany jest rozmiar pliku zip w bajtach, w drugim etapie wysyłany jest plik we fragmentach nie większych niż 1 MB.

Przetestuj z użyciem telnetu lub samodzielnie napisanego klienta.
