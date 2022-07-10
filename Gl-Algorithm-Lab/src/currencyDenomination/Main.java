package currencyDenomination;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		MergeSort mergeSort = new MergeSort();
		NoteCount notesCount = new NoteCount();

		System.out.println("Enter the Size of Currency Denominations ");
		try (Scanner sc = new Scanner(System.in)) {
			int size = sc.nextInt();
			int[] notes = new int[size];
			System.out.println("Enter the Currency Denominations Value");
			for (int i = 0; i < size; i++) {
				notes[i] = sc.nextInt();
			}
			System.out.println("Enter the Amount You Want to Pay");
			int amount = sc.nextInt();
			mergeSort.sort(notes,0,notes.length-1);
			notesCount.notesCount(notes, amount);
		}
	}
}