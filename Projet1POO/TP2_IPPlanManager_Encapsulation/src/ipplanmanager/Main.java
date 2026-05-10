package ipplanmanager;

public class Main {

    public static void main(String[] args) {
        System.out.println(" TP2 : Encapsulation ");

        AdresseIP ip1 = new AdresseIP("192.168.1.1");
        AdresseIP ip2 = new AdresseIP("");
        AdresseIP ip3 = new AdresseIP(null);
        AdresseIP ip4 = new AdresseIP("10.0.0.1");

        System.out.println();
        System.out.println(" Test adresse locale ");
        System.out.println("ip1 locale ? " + ip1.estAdresseLocale());
        System.out.println("ip4 locale ? " + ip4.estAdresseLocale());

        InterfaceReseau interface1 = new InterfaceReseau("eth0", ip1);
        InterfaceReseau interface2 = new InterfaceReseau("", ip2);
        InterfaceReseau interface3 = new InterfaceReseau("eth1", ip4);

        interface1.activer();
        interface3.activer();

        Equipement routeur = new Equipement("R1_EDGE", "Routeur", interface1);
        Equipement serveur = new Equipement("", "", interface2);
        Equipement switch1 = new Equipement("SW1_CORE", "Switch", interface3);

        ReseauIP reseau1 = new ReseauIP("192.168.1.0", 24, "Réseau principal");
        ReseauIP reseau2 = new ReseauIP("", 55, "");

        routeur.setNom("R1_EDGE_MODIFIE");

        System.out.println();
        System.out.println(" Réseau 1 ");
        reseau1.afficher();

        System.out.println();
        System.out.println(" Réseau 2 invalide ");
        reseau2.afficher();

        System.out.println();
        System.out.println(" Equipement 1 ");
        routeur.afficher();

        System.out.println();
        System.out.println(" Equipement 2 invalide ");
        serveur.afficher();

        System.out.println();
        System.out.println(" Equipement 3 ");
        switch1.afficher();
    }
}
