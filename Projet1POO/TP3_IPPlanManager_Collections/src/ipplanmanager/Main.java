package ipplanmanager;

public class Main {

    public static void main(String[] args) throws Exception {

        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));

        InfrastructureReseau infrastructure =
                new InfrastructureReseau("Infrastructure YFY");

        // Sous-réseaux
        ReseauIP reseauAdmin = new ReseauIP("192.168.1.0", 24, "Réseau administration");
        ReseauIP reseauTech = new ReseauIP("192.168.2.0", 24, "Réseau technique");
        ReseauIP reseauWifi = new ReseauIP("192.168.3.0", 24, "Réseau WiFi");

        SousReseau admin = new SousReseau("ADMIN", reseauAdmin);
        SousReseau tech = new SousReseau("TECH", reseauTech);
        SousReseau wifi = new SousReseau("WIFI", reseauWifi);

        infrastructure.ajouterSousReseau(admin);
        infrastructure.ajouterSousReseau(tech);
        infrastructure.ajouterSousReseau(wifi);

        // Routeur avec deux interfaces
        AdresseIP ip1 = new AdresseIP("192.168.1.1");
        AdresseIP ip2 = new AdresseIP("10.0.0.1");
        InterfaceReseau eth0 = new InterfaceReseau("eth0", ip1);
        InterfaceReseau eth1 = new InterfaceReseau("eth1", ip2);
        eth0.activer();
        eth1.activer();
        Equipement routeur = new Equipement("R1_EDGE", "Routeur");
        routeur.ajouterInterface(eth0);
        routeur.ajouterInterface(eth1);
        infrastructure.ajouterEquipement(routeur);

        // Switch avec deux interfaces
        AdresseIP ip3 = new AdresseIP("192.168.1.2");
        AdresseIP ip4 = new AdresseIP("192.168.2.2");
        InterfaceReseau sw_eth0 = new InterfaceReseau("eth0", ip3);
        InterfaceReseau sw_eth1 = new InterfaceReseau("eth1", ip4);
        sw_eth0.activer();
        Equipement switch1 = new Equipement("SW1_CORE", "Switch");
        switch1.ajouterInterface(sw_eth0);
        switch1.ajouterInterface(sw_eth1);
        infrastructure.ajouterEquipement(switch1);

        // Serveur avec une interface
        AdresseIP ip5 = new AdresseIP("192.168.1.10");
        InterfaceReseau srv_eth0 = new InterfaceReseau("eth0", ip5);
        srv_eth0.activer();
        Equipement serveur = new Equipement("SRV_DNS", "Serveur");
        serveur.ajouterInterface(srv_eth0);
        infrastructure.ajouterEquipement(serveur);

        // Point d'accès WiFi
        AdresseIP ip6 = new AdresseIP("192.168.3.1");
        InterfaceReseau ap_wlan0 = new InterfaceReseau("wlan0", ip6);
        ap_wlan0.activer();
        Equipement apWifi = new Equipement("AP_WIFI", "Point d'accès WiFi");
        apWifi.ajouterInterface(ap_wlan0);
        infrastructure.ajouterEquipement(apWifi);

        // Postes clients
        AdresseIP ip7 = new AdresseIP("192.168.1.50");
        InterfaceReseau pc1_eth0 = new InterfaceReseau("eth0", ip7);
        Equipement pc1 = new Equipement("PC_ADMIN", "Poste client");
        pc1.ajouterInterface(pc1_eth0);
        infrastructure.ajouterEquipement(pc1);

        AdresseIP ip8 = new AdresseIP("192.168.2.50");
        InterfaceReseau pc2_eth0 = new InterfaceReseau("eth0", ip8);
        Equipement pc2 = new Equipement("PC_TECH", "Poste client");
        pc2.ajouterInterface(pc2_eth0);
        infrastructure.ajouterEquipement(pc2);

        // Afficher toute l'infrastructure
        infrastructure.afficher();

        // Test recherche
        System.out.println(" RECHERCHE ");
        infrastructure.rechercherEquipement("R1_EDGE");
        System.out.println();
        infrastructure.rechercherEquipement("INCONNU");
    }
}
