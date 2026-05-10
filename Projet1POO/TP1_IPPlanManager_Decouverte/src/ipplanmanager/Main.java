package ipplanmanager;

public class Main {
    public static void main(String[] args) {
        System.out.println(" IPPlan-Manager : TP1 ");
        System.out.println("Découverte des premières classes du projet");
        System.out.println();

        AdresseIP ipRouteur = new AdresseIP("192.168.1.1");
        AdresseIP ipServeur = new AdresseIP("192.168.1.10");
        AdresseIP ipClient = new AdresseIP("192.168.1.50");

        InterfaceReseau interfaceRouteur = new InterfaceReseau("eth0", ipRouteur);
        InterfaceReseau interfaceServeur = new InterfaceReseau("eth0", ipServeur);
        InterfaceReseau interfaceClient = new InterfaceReseau("wlan0", ipClient);

        interfaceRouteur.activer();
        interfaceServeur.activer();

        Equipement routeur = new Equipement("R1_EDGE", "Routeur", interfaceRouteur);
        Equipement serveur = new Equipement("SRV_DNS", "Serveur", interfaceServeur);
        Equipement client = new Equipement("PC_ADMIN", "Poste client", interfaceClient);

        ReseauIP reseauPrincipal = new ReseauIP(
                "192.168.1.0",
                24,
                "Réseau principal du laboratoire IRT"
        );

        System.out.println(" Réseau créé ");
        reseauPrincipal.afficher();

        System.out.println();
        System.out.println(" Équipements créés ");

        System.out.println();
        routeur.afficher();

        System.out.println();
        serveur.afficher();

        System.out.println();
        client.afficher();

        //  TRAVAIL DEMANDE 

        ReseauIP reseau2 = new ReseauIP("192.168.2.0", 24, "Réseau secondaire du labo");

        InterfaceReseau interfaceSansIP = new InterfaceReseau("eth1", null);
        Equipement sw1 = new Equipement("SW1_CORE", "Switch", interfaceSansIP);

        AdresseIP ipWifi = new AdresseIP("192.168.2.1");
        InterfaceReseau interfaceWifi = new InterfaceReseau("wlan0", ipWifi);
        interfaceWifi.activer();
        Equipement wifi = new Equipement("AP_WIFI", "Point d'accès WiFi", interfaceWifi);

        AdresseIP ipClient2 = new AdresseIP("192.168.2.50");
        InterfaceReseau interfaceClient2 = new InterfaceReseau("eth0", ipClient2);
        Equipement client2 = new Equipement("PC_ETUDIANT", "Poste client", interfaceClient2);

        System.out.println();
        System.out.println(" Deuxième Réseau ");
        reseau2.afficher();

        System.out.println();
        System.out.println(" Équipements supplémentaires ");

        System.out.println();
        sw1.afficher();

        System.out.println();
        wifi.afficher();

        System.out.println();
        client2.afficher();
    }
}
