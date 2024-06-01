package TubesPerbankan;

import java.util.Scanner;

public class pengelolacabang {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        sistem graph = new sistem(10); // Inisialisasi dengan ukuran maksimal yang cukup besar

	        while (true) {
	            System.out.println("Menu:");
	            System.out.println("1. Tambah Cabang");
	            System.out.println("2. Tambah Hubungan Antar Cabang");
	            System.out.println("3. Lihat Daftar Cabang");
	            System.out.println("4. Lihat Hubungan Antar Cabang");
	            System.out.println("5. Keluar");
	            System.out.print("Pilih opsi: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Clear buffer

	            switch (choice) {
	                case 1:
	                    System.out.print("Masukkan jumlah cabang yang akan dimasukkan: ");
	                    int numBranches = scanner.nextInt();
	                    scanner.nextLine(); // Clear buffer

	                    System.out.println("Masukkan nama-nama cabang:");
	                    for (int i = 0; i < numBranches; i++) {
	                        System.out.print("Cabang ke-" + (graph.getNVerts() + 1) + ": ");
	                        String branchName = scanner.nextLine();
	                        graph.addVertex(branchName);
	                    }
	                    break;
	                case 2:
	                    if (graph.getNVerts() < 2) {
	                        System.out.println("Minimal harus ada dua cabang untuk menambah hubungan.");
	                        break;
	                    }
	                    graph.displayVertices();
	                    System.out.println("Masukkan hubungan antar cabang (dengan indeks cabang):");
	                    System.out.println("Contoh: Masukkan 1 2 untuk menghubungkan cabang ke-1 dan ke-2");
	                    for (int i = 0; i < graph.getNVerts(); i++) {
	                        System.out.print("Hubungan untuk cabang ke-" + (i + 1) + ": ");
	                        int start = scanner.nextInt();
	                        int end = scanner.nextInt();
	                        graph.addEdge(start - 1, end - 1); // Kurangi 1 untuk menyesuaikan indeks
	                    }
	                    break;
	                case 3:
	                    System.out.println("Daftar Cabang:");
	                    graph.displayVertices();
	                    break;
	                case 4:
	                    System.out.println("Matriks Kedekatan:");
	                    graph.displayAdjacencyMatrix();
	                    break;
	                case 5:
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Opsi tidak valid.");
	            }
	        }
	    }
	}
