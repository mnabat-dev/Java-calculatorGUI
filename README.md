# Java JFrame Calculator

A desktop calculator built with Java and Swing ("JFrame"), separating the graphical user interface ("TaschenrechnerGUI") from the calculation logic ("rechnen").

## Project Structure

- "TaschenrechnerGUI.java" – Swing "JFrame" GUI with number, operator, decimal ("."), sign toggle ("+/-"), percentage ("%"), clear ("AC"), and equals ("=") buttons, plus keyboard shortcuts ("Enter" to calculate, "Q" or "Escape" to close).
- "rechnen.java" – Calculation class ("rechnen") handling input validation, operator splitting ("+", "-", "*", "/"), percentage handling, division-by-zero checks, and error/result getters ("getFehler()", "getErgebnis()").
- GUI form definition file – Form layout description ("TFGUIForm") from the visual GUI builder.

## Features

- Basic arithmetic operations ("+", "-", "*", "/")
- Percentage calculations ("%") and sign toggling ("+/-")
- Decimal input handling (".") and "AC" reset
- Keyboard support ("Enter", "Q", "Escape") and error dialogs ("JOptionPane")

## How to Run

1. Make sure a JDK is installed.
2. Compile the Java source files ("javac rechnen.java TaschenrechnerGUI.java").
3. Run "java TaschenrechnerGUI".



# Java-JFrame-Taschenrechner

Ein Desktop-Taschenrechner in Java mit Swing (`JFrame`), bei dem die Benutzeroberfläche (`TaschenrechnerGUI`) von der Rechenlogik (`rechnen`) getrennt ist.

## Projektstruktur

- `TaschenrechnerGUI.java` – Swing-`JFrame`-Oberfläche mit Ziffern- (`0`–`9`), Operator-, Komma- (`.`), Vorzeichen- (`+/-`), Prozent- (`%`), Lösch- (`AC`) und Gleichheits-Buttons (`=`) sowie Tastenkürzeln (`Enter` zum Berechnen, `Q` oder `Escape` zum Schließen).
- `rechnen.java` – Logik-Klasse (`rechnen`) für Eingabeprüfung, `split`-Zerlegung bei `+`, `-`, `*` und `/`, Prozentberechnung am Ausdrucksende, Prüfung auf Division durch Null sowie Getter (`getFehler()`, `getErgebnis()`).
- Formular-Definitionsdatei – Layout-Beschreibung (`TFGUIForm`) aus dem GUI-Designer.

## Funktionen

- Grundrechenarten (`+`, `-`, `*`, `/`)
- Prozentberechnung (`%`) und Vorzeichenwechsel (`+/-`)
- Eingabe von Dezimalpunkten (`.`) und Zurücksetzen über `AC`
- Tastaturkürzel (`Enter`, `Q`, `Escape`) sowie Fehlermeldungen über `JOptionPane`

## Starten

1. Stelle sicher, dass ein JDK installiert ist.
2. Kompiliere die Java-Dateien: `javac rechnen.java TaschenrechnerGUI.java`
3. Starte das Programm: `java Taschenrechner`
