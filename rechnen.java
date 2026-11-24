import java.util.ArrayList;

public class rechnen {
  public ArrayList<String> input = new ArrayList<String>();
  public String rechnung;
  public String fehler = ".";
  public String regexp = "[+]";
  public String regexm = "[-]";
  public String regexd = "[/]";
  public String regexmal = "[*]";
  public double ergebnis = 0;
  public char operator = ' ';
  public boolean prozentrechnung = false;

  public rechnen(String rechnung) {
    this.rechnung = rechnung;
  }

  public void rechner() {
    input.clear();
    fehler = ".";
    ergebnis = 0;
    operator = ' ';
    prozentrechnung = false;

    try {
      String ausdruck = rechnung == null ? "" : rechnung.trim();
      if (ausdruck.isEmpty()) {
        fehler = "[Fehler] Bitte geben Sie eine Rechnung ein.";
        return;
      }

      // Falls am Ende ein '%' steht, merken und entfernen, damit der Operator sauber erkannt wird
      if (ausdruck.endsWith("%")) {
        prozentrechnung = true;
        ausdruck = ausdruck.substring(0, ausdruck.length() - 1);
      } else if (ausdruck.contains("%")) {
        fehler = "[Fehler] '%' ist nur am Ende einer Zahl erlaubt.";
        return;
      }

      // Falls nur eine Prozentzahl wie "50%" eingegeben wurde (ohne +, -, *, /)
      if (prozentrechnung
          && !ausdruck.contains("+")
          && !ausdruck.contains("-")
          && !ausdruck.contains("/")
          && !ausdruck.contains("*")) {
        double zahl = Double.parseDouble(ausdruck);
        ergebnis = zahl / 100.0;
        return;
      }

      String[] teile;
      if (ausdruck.contains("+")) {
        teile = ausdruck.split(regexp);
        operator = '+';
      } else if (ausdruck.contains("-")) {
        teile = ausdruck.split(regexm);
        operator = '-';
      } else if (ausdruck.contains("/")) {
        teile = ausdruck.split(regexd);
        operator = '/';
      } else if (ausdruck.contains("*")) {
        teile = ausdruck.split(regexmal);
        operator = '*';
      } else {
        fehler = "[Fehler] Falscher Operator! (+, -, /, *)";
        return;
      }

      if (teile.length < 2 || teile[0].isEmpty() || teile[1].isEmpty()) {
        fehler = "[Fehler] Sie müssen zwei Zahlen eingeben um etwas zu berechnen.";
        return;
      }

      input.add(teile[0]);
      input.add(teile[1]);

      double wert1 = Double.parseDouble(input.get(0));
      double wert2 = Double.parseDouble(input.get(1));

      if (prozentrechnung) {
        if (operator == '+' || operator == '-') {
          // z. B. 100 + 10% -> 10% von 100 = 10 -> 100 + 10 = 110
          wert2 = wert1 * (wert2 / 100.0);
        } else {
          // z. B. 50 * 20% -> 50 * 0.2 = 10 | 50 / 20% -> 50 / 0.2 = 250
          wert2 = wert2 / 100.0;
        }
      }

      switch (operator) {
        case '+':
          ergebnis = wert1 + wert2;
          break;
        case '-':
          ergebnis = wert1 - wert2;
          break;
        case '/':
          if (wert2 == 0) {
            fehler = "[Fehler] Division durch Null ist nicht erlaubt.";
            return;
          }
          ergebnis = wert1 / wert2;
          break;
        case '*':
          ergebnis = wert1 * wert2;
          break;
        default:
          fehler = "[Fehler] Etwas ist schief gelaufen!";
          return;
      }

      if (Double.isNaN(ergebnis) || Double.isInfinite(ergebnis)) {
        fehler = "Die Rechnung ist mathematisch nicht richtig.";
      }
    } catch (NumberFormatException e) {
      fehler = "[Fehler] Ihre Eingabe muss aus gültigen Zahlen bestehen!";
    } catch (ArrayIndexOutOfBoundsException e) {
      fehler = "[Fehler] Sie müssen zwei Zahlen eingeben um etwas zu berechnen.";
    } catch (Exception e) {
      fehler = "[Fehler] : Ihre Eingabe muss nur aus Zahlen bestehen! \n" + e;
    }
  }

  public double getErgebnis() {
    return ergebnis;
  }

  public String getFehler() {
    return fehler;
  }
}