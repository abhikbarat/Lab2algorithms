package currencyDenomination;

public class NoteCount {

	public void notesCount(int notes[], int amount) {

		int[] noteCounter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}}
			if (amount > 0) {
				System.out.println("Exact Amount Cannot be Given With the Highest Denomination");
			} else {
				System.out.println("Your Payment Approach in Order to Give Min No. of Notes Will Be");
				for (int i = 0; i < notes.length; i++) {
					if (noteCounter[i] != 0) {
						System.out.println(notes[i] + ":" + noteCounter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e+ " Notes of Denomination 0 is Invalid");
		}
	}
}
