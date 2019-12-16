package Brasil;

public class Temperature {

	public int Tmin; // Maximal temperature
	public int Tmax; // Minimal temperature

	public static void main(String args[]) {
		Graphisme graphe = new Graphisme();
		graphe.setVisible(true);
		if (args.length == 1) {
			while (Draw.condition != -1) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				String[] tab = new String[2];
				Client theApp = new Client(args[0]);
				if (Draw.condition < 20) {
					tab = theApp.getDate();
					Draw.tab_data[Draw.condition][0] = tab[0]; // date recovery
					Draw.tab_data[Draw.condition][1] = tab[1]; // temperature recovery
				} else {
					for (int i = 0; i < 19; i++) // Data shift to leave the last row of the table empty
					{
						Draw.tab_data[i][0] = Draw.tab_data[i + 1][0]; // date recovery
						Draw.tab_data[i][1] = Draw.tab_data[i + 1][1]; // temperature recovery
					}
					// Filling the last line of the table
					tab = theApp.getDate();
					Draw.tab_data[19][0] = tab[0]; // date recovery
					Draw.tab_data[19][1] = tab[1]; // temperature recovery
				}
				Draw.condition++;
				graphe.repaint();
			}
			// Call the function to display the graph
		} else {
			System.out.println("Error: you must provide the address of the server");
			System.out.println("Usage is:  java Client x.x.x.x  (e.g. java Client 192.168.7.2)");
			System.out.println("      or:  java Client hostname (e.g. java Client localhost)");
		}

		System.out.println("**. End of Application.");
	}

}
