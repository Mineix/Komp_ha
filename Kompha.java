import java.io.PrintStream;
import java.util.Scanner;


public class Kom_Aufgabe {
	private static void generateBox(String msg) {    //Methode erstellen um eine statisch erzeugte Box zu generieren um ausgabe box der variable anzupassen
		int lenght = msg.length();      // länge soll der nachhricht angepasst werden
		int width = lenght - 2;         // breite ebenfalls nur 2 charackter kleiner
		PrintStream out =  System.out;         
		out.println("\n╭─"+"━".repeat(width) + "─╮" ); // eigentliche befehl mit 
		out.println("|"+msg+"|" );
		out.println("╰─"+"━".repeat(width) + "─╯" );
	}
	static void wandleBinInDez() {

	}

	public static void main(String[] args) {

		wandleBinInDez();
		String bin = "";
		int dezZahl, i = 364, count = 0;
		char menu, dezimal, ITrechner = 0;
		boolean open, start = true;

		int anzahlVerschiebung = 0;
		int dezZahl1 = 0;
		int restWert = 0;

		String hex = Integer.toHexString(i);
		while (start) { 
			generateBox("Bitte true eingeben zum Starten");
			open = Kon.readBoolean();
			if(open = true) {
				generateBox("Was möchten sie Rechnen");
			System.out.println("" 
					+ " ╭─━━━━━━━━━━━━━━━━━━━━━━━━━━─╮ "
					+ " \n |Dez --> Bin|Bitte D Eigeben,|"  // (⌐■_■)--︻╦╤─ - - - - - -      ̿ ̿ ̿ ̿'\\̵͇̿̿\\з=(◕_◕) "
					+ " \n |Bin --> Dez|Bitte B Eigeben,|" 
					+ " \n |Dez --> Hex|Bitte H Eigeben.|"
					+ " \n ╰─━━━━━━━━━━━━━━━━━━━━━━━━━━─╯");
			ITrechner = Kon.readChar();}
			switch (ITrechner) {
			case 'D': {
				System.out.println(" ╭─━━━━━━━━━━━━━━━━━━━━━━━─╮");
				System.out.println(" |Bitte DezZahl Eingeben:  |");
				System.out.println(" ╰─━━━━━━━━━━━━━━━━━━━━━━━─╯");
				
				dezZahl = Kon.readInt();
				while (dezZahl != 0) {
					if (dezZahl % 2 == 0) {
						bin = "0" + bin;
					} else {
						bin = "1" + bin;
					}

					dezZahl = dezZahl / 2;
					count++;
					if (count == 4) {
						bin = " " + bin;
						count = 0;
					}
				}
				
			generateBox("Ihre BinZahl Lautet: "+ bin );
				

				break;
			}
			case 'B': {
				Scanner eingabe = new Scanner(System.in);
				System.out.println(" ╭─━━━━━━━━━━━━━━━━━━━━━━━─╮");
				System.out.println(" |Bitte Binzahl eingeben!  |");
				System.out.println(" ╰─━━━━━━━━━━━━━━━━━━━━━━━─╯");
				int binZahl = eingabe.nextInt();
				while (binZahl != 0) {
					restWert = binZahl % 10;
					dezZahl1 = dezZahl1 + (int) (restWert * (Math.pow(2, anzahlVerschiebung)));
					binZahl = binZahl / 10;
					anzahlVerschiebung = anzahlVerschiebung + 1;
				}
				if (dezZahl1 > 10) {
					System.out.println(" ╭─━━━━━━━━━━━━━━━━━━━━━━━─╮");
					System.out.println(" |" + "Ihre DezZahl lautet: " + dezZahl1 + " " + " |");
					System.out.println(" ╰─━━━━━━━━━━━━━━━━━━━━━━━─╯");

				} else {
					System.out.println(" ╭─━━━━━━━━━━━━━━━━━━━━━━━─╮");
					System.out.println(" |" + "Ihre DezZahl lautet: " + " " + dezZahl1 + " " + " |");
					System.out.println(" ╰─━━━━━━━━━━━━━━━━━━━━━━━─╯");

				}

				System.out.println();
		
				break;

			}

			case 'H': {
				System.out.println("Bitte Dezimalzahl eingeben: ");
				dezZahl = Kon.readInt();
				System.out.println("Hexwert: 0x" + hex);
				Integer in = Integer.parseInt(hex, 16);
				System.out.println("Dezimalwert: " + in);
				
				break;

			}
			
			case 'X': {
				System.out.println("Programm Wird Beendet!! ");
				start = false;
			}
			default: {
				System.out.println("Bye,Bye");
			}

			}
		}
	}
}

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);
		int dezZahl = eingabe.nextInt();
		String binär = "";
		String ergebnisZahl = "";
		int counter = 0;
		String zeichnen = "";


		while (dezZahl != 0) {
			if (dezZahl % 2 == 0) {
				binär = "0" + binär;
			} else {
				binär = "1" + binär;
			}

			dezZahl = dezZahl / 2;
			counter++;
			if (counter == 4) {
				binär = " " + binär;
				counter = 0;
			}
		}
		
		String[] split = binär.split(" ");

		for (int x = 0; x < split.length; x++) {
			zeichnen = split[x];
			if (zeichnen.equals("")) {
				continue;
			}
			
			int dezimalZahl = 0;
			int restWert = 0;
			int anzahlVerschiebung = 0;
			int numberInt = Integer.parseInt(zeichnen);

			while (numberInt != 0) {
				restWert = numberInt % 10;
				dezimalZahl = dezimalZahl + (int) (restWert * (Math.pow(2, anzahlVerschiebung)));
				numberInt = numberInt / 10;
				anzahlVerschiebung = anzahlVerschiebung + 1;
			}
			
			

			if (dezimalZahl >= 10) {
				char c = (char) (((int)('A') -10)+ dezimalZahl);
				ergebnisZahl += c;	
			} else {
				ergebnisZahl += dezimalZahl;
			}

		}

		System.out.println(ergebnisZahl);
	}

