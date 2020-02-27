import java.util.Date;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {


    // private static Class<Wilaya> wilaya;

    public static void main(String[] args) throws SuperficieHabitableException, SurfaceNulleNegativeException {
        ImmoESI agence = new ImmoESI();
        TreeSet<Proprietaire> proprietaires = new TreeSet<Proprietaire>();
        //Se connecter en tant qu'admin
        Administrateur admin = new Administrateur("walid", "24102000");
        Administrateur admin2 = new Administrateur("akram", "23062001");
        agence.administrateurs.add(admin);
        agence.administrateurs.add(admin2);
        System.out.print("                        ____________________________________     ______________________________________\n");
        System.out.print("                     .-/|       ~~~~~~ ***** ~~~~~~          \\ /           ~~~~~~ ***** ~~~~~~        |\\-.\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||  Ecole Superieure d'Informatique    :       Cycle preparatoire  (2CP)       ||||\n");
        System.out.print("                     ||||");
        System.out.print("                     _");
        System.out.print("               :              Module : POO             ||||\n");
        System.out.print("                     ||||");
        System.out.print("                    |_|");
        System.out.print("              :                    TP                 ||||\n");
        System.out.print("                     ||||");
        System.out.print("                    /_/");
        System.out.print("              :                                       ||||\n");
        System.out.print("                     ||||");
        System.out.print("            ___  ___ _");
        System.out.print("               :                                       ||||\n");
        System.out.print("                     ||||");
        System.out.print("           / _ \\/ __| |");
        System.out.print("              :                                       ||||\n");
        System.out.print("                     ||||");
        System.out.print("          |  __/\\__ \\ |              :");
        System.out.print("                                       ||||\n");
        System.out.print("                     ||||");
        System.out.print("           \\___||___/_|              : ");
        System.out.print("                                      ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||");
        System.out.print("  Programme : ");
        System.out.print("                       :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||  Gestion d'une agence immobiliere   :                                       ||||\n");
        System.out.print("                     ||||                                     :");
        System.out.print("   Realise par :");
        System.out.print("                       ||||\n");
        System.out.print("                     ||||    --> Manipulation des classes     :                                       ||||\n");
        System.out.print("                     ||||    --> Manipulation de l'heritage   :");

        System.out.print("     --> Belguenbour Walid");
        System.out.print("             ||||\n");
        System.out.print("                     ||||    --> ...                          :");

        System.out.print("     --> Noui Akram");
        System.out.print("                    ||||\n");

        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :");

        System.out.print("        Section B Groupe 5");
        System.out.print("             ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :");

        System.out.print("   Encadre par :");
        System.out.print("                       ||||\n");
        System.out.print("                     ||||                                     :                                       ||||\n");
        System.out.print("                     ||||                                     :");

        System.out.print("                Mme BOUSBIA ");
        System.out.print("           ||||\n");
        System.out.print("                     ||||____________________________________ : ______________________________________||||\n");
        System.out.print("                     ||/=====================================\\:/=======================================\\||\n");
        System.out.print("                     `--------------------------------------~___~---------------------------------------''\n\n\n");

        /*Creation liste des proprietaires*/
        Proprietaire prop1 = new Proprietaire("Belguenbour", "+213*********", "walid", "iw_belguenbour@esi.dz", "Dely Brahim");
        Proprietaire prop2 = new Proprietaire("Noui", "+213*********", "moussa", "im_noui@esi.dz", "Bouraoui");
        Proprietaire prop3 = new Proprietaire("Hafri", "+213*********", "seif", "is_hafri@esi.dz", "Beni-Ourthilane");
        Proprietaire prop4 = new Proprietaire("NINI", "+213*********", "Dhia", "id_nini@esi.dz", "Lebanon");
        proprietaires.add(prop1);
        proprietaires.add(prop2);
        proprietaires.add(prop3);
        proprietaires.add(prop4);
        agence.setProprietaires(proprietaires);
        /*Creation liste des biens*/
        Date date = new Date();
        Date date1 = new Date("2019/2/2");
        Date date2 = new Date("2018/5/2");
        Date date3 = new Date("2007/9/1");
        Date date4 = new Date("2006/1/11");
        Date date5 = new Date("2005/3/13");
        Date date6 = new Date("2004/2/12");
        Date date7 = new Date("1990/2/2");

        Wilaya alger = Enum.valueOf(Wilaya.class, "alger"); // wilaya 2
        Wilaya setif = Enum.valueOf(Wilaya.class, "setif");//wilaya 1
        Wilaya batna = Enum.valueOf(Wilaya.class, "batna");//wilaya3
        TypeDeTransaction vente = Enum.valueOf(TypeDeTransaction.class, "vente");
        TypeDeTransaction location = Enum.valueOf(TypeDeTransaction.class, "location");
        TypeDeTransaction echange = Enum.valueOf(TypeDeTransaction.class, "echange");
        Bien bien1 = new Appartement("bien1", alger, 120, prop2, vente, 4000000, false, "", date, "", 4, false, 1, false);
        Bien bien2 = new Maison("bien2 ", batna, 200, prop1, vente, 10000000, true, "", date1, "", 0, false, true, true, true, 200);
        Bien bien3 = new Terrain("bien3", setif, 500, prop1, vente, 20000000, false, "", date2, "", 3, "");
        Bien bien4 = new Appartement("bien4", batna, 100, prop2, location, 40000, false, "", date3, "", 3, false, 1, false, false, false);
        Bien bien5 = new Maison("bien5", alger, 160, prop3, location, 150000, true, "", date4, "", 5, false, 2, true, true, true, 100);
        Bien bien6 = new Appartement("bien6", batna, 50, prop2, location, 600000, false, "", date5, "", 3, false, 6, false, false, true);
        Bien bien7 = new Terrain("bien7", setif, 650, prop1, echange, 18000000, false, "", date6, "", 1, "", batna);
        Bien bien8 = new Maison("bien8 ", alger, 200, prop2, echange, 14000000, true, "", date7, "", 2, true, false,false, 100, alger);

        agence.ajouterBien(admin, bien1);
        agence.ajouterBien(admin, bien8);
        agence.ajouterBien(admin, bien3);
        agence.ajouterBien(admin, bien4);
        agence.ajouterBien(admin, bien5);
        agence.ajouterBien(admin, bien6);
        agence.ajouterBien(admin, bien7);
        agence.ajouterBien(admin, bien2);
        critere cri1 = new critere();
        Terrain terrain = new Terrain();
        Appartement appartement = new Appartement();
        Maison maison = new Maison();
        cri1.liste_des_biens_filtres.addAll(agence.liste_des_biens);
        int choix;
        do {
            System.out.println("    1 - se connecter en tant qu'utilisateur");
            System.out.println("    2 - se connecter en tant qu'administrateur");
            System.out.println("    3 - Quitter\n\n");
            Scanner sc = new Scanner(System.in);
            System.out.print("Veuillez introduire votre choix : ");

            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    do{
                        System.out.println("    1 - affichage des biens d'un proprietaire");
                        System.out.println("    2 - affichage detaille d'un bien");
                        System.out.println("    3 - calcul des prix");
                        System.out.println("    4 - recherche filtree");
                        System.out.println("    5 - Gestion de messages");
                        System.out.println("    6 - afficher tous les biens existants");
                        System.out.println("    7 - Quitter\n");
                        choix = sc.nextInt();
                    switch (choix) {
                        case 1:
                        System.out.println("************************affichage des biens d'un proprietaire************************************************\n\n\n\n");

                        /*GESTION BIENS DES PROPRIETAIRES*/
                        /*Afficher liste des biens d'un proprietaire*/
                            System.out.println(ConsoleColors.YELLOW);
                            System.out.println("******nom du proprietaire : \n\n" + prop1.getNom());
                            System.out.println(ConsoleColors.RESET );
                            System.out.println("*********** liste des proprietes ***********\n\n");

                            prop1.afficher_biens_proprietaires();
                        // prop2.afficher_biens_proprietaires();
                            break;
                        case 2 :
                        System.out.println("************************affichage detaille d'un bien************************************************\n\n\n\n");
                            System.out.println(ConsoleColors.GREEN_BOLD);
                            bien5.afficherDetail();
                            System.out.println(ConsoleColors.RESET );
                            break;
                        case 3 :
                        System.out.println("************************calcul du prix************************************************\n\n");
                        int cpt = 0;
                        for (Bien ele : ImmoESI.liste_des_biens) {

                           // System.out.println("NUMERO DU BIEN : " + cpt);
                            ele.afficher();
                            System.out.println(ConsoleColors.YELLOW_BOLD);
                            System.out.println("$$$$$$$$$$$$$$$$\t    prix final :      " + ele.calculerprix());
                            System.out.println(ConsoleColors.RESET );


                            System.out.println("---------------------------------------");
                            cpt++;
                        }
                        break;
                        case 4:
                        System.out.println("************************recherche filtrée************************************************\n\n");
                            System.out.println(ConsoleColors.GREEN);
                            System.out.println("***bien recherche : Appartement , à batna de prix superieur à 16000 DA et inferieur à 1000000***\n ");
                            System.out.println(ConsoleColors.CYAN);
                            cri1.recherche_critere(Wilaya.batna);
                            cri1.recherche_critere(appartement);
                            criterePrix cp = new criterePrix(16000, 1000000);
                            cri1.recherche_critere(cp);

                        //cri1.recherche_critere(echange);
                        cri1.afficher_resultat();
                        System.out.println(ConsoleColors.RESET );

                            break;
                        case 5 :
                        /*GESTION DES MESSAGES*/
                        /*Envoyer un message*/
                        agence.envoyerMessage(bien1, "Je suis interessé par ce bien");
                        agence.envoyerMessage(bien2, "Pouvons nous visiter ce bien");
                        agence.envoyerMessage(bien3, "Ce bien est il encore disponible ? ");
                        /*Afficher la liste des messages*/
                            agence.afficherMessages(admin);

                            /*GESTION DES MESSAGES*/
                            break;
                        case 6:
                            System.out.println("******************  biens existants  ****************************");
                            agence.afficher_liste_des_bien();
                        break;
                        case 7:
                            break;
                    }
            }while (choix != 7);
                case 2:


                    sc = new Scanner(System.in);
                    System.out.println("Se connecter en tant qu'administrateur");
                    System.out.println("IDENTIFIANT ");
                    String identifiant = sc.nextLine();
                    System.out.println("MOT DE PASSE");
                    String motdepasse = sc.nextLine();
                    Administrateur seconnecter = new Administrateur(identifiant, motdepasse);
                    if (agence.seconnecter(seconnecter)) {
                        do {
                            System.out.println("    1 - ajouter un bien" );
                            System.out.println("    2 - suppression d'un bien");
                            System.out.println("    3 - archiver un bien");
                            System.out.println("    4 - modification d'un bien ");
                            System.out.println("    5 - Quitter\n");
                            choix = sc.nextInt();
                            switch (choix) {

                                case 1:
                                        System.out.println("************************ajout d'un bien************************************************\n\n\n\n");
                                        Bien biena = null;
                                        /* ajout d'un bien */
                                        System.out.println("ajout d'un appartement  :  ");
                                        boolean error = false;
                                        try {
                                            biena = agence.AjouterAppart(prop1, vente);
                                        } catch (SurfaceNulleNegativeException e) {
                                            error = true;
                                            System.out.println("surface erronee");
                                        }catch (BienExistantException e) {
                                            System.out.println("bien existe deja");
                                        }finally {
                                            if (error) {
                                                try {
                                                    biena = agence.AjouterAppart(prop1, vente);
                                                } catch (BienExistantException e) {
                                                    System.out.println("surface erronee");
                                                }
                                            }
                                        }
                                        agence.ajouterBien(admin, biena);
                                        agence.afficher_liste_des_bien();
                                        break;
                                case 2 :
                                        System.out.println("************************suppression d'un bien************************************************\n\n\n\n");
                                        System.out.println(ConsoleColors.RED_BOLD);
                                        System.out.println("§§§§§§§§§§§§      bien supprimé : bien1\n*** ");
                                        bien1.afficher();
                                        System.out.println(ConsoleColors.RESET);
                                        System.out.println("\n------------------------------------\n");
                                        agence.supprimer_bien(admin, bien1);
                                        Proprietaire prop = bien1.proprietaire;
                                        agence.afficher_liste_des_bien();
                                        // mise à ajour de la liste des proprio ( supression en cas de vide)
                                    if (prop.liste_proprietees.isEmpty()) proprietaires.remove(prop);
                                        agence.ajouterBien(admin, bien1);
                                        break;
                                case 3 :
                                        System.out.println("************************archiver un bien************************************************\n\n\n\n");
                                        System.out.println("bien archivé: bien2 ");
                                        agence.archiver_bien(admin, bien2);
                                        agence.afficher_liste_des_bien();
                                    System.out.println(ConsoleColors.RED_BOLD);

                                    System.out.println("************************liste des biens archives************************************************\n\n");
                                    System.out.println(ConsoleColors.RED);

                                    agence.afficher_liste_des_bien_archives();
                                    System.out.println(ConsoleColors.RESET);
                                    System.out.println("*************************************************************************************\n\n");


                                    break;
                                case 4:
                                        System.out.println("************************modification d'un bien************************************************\n\n");
                                        /*GESTION DES MODFICATIONS*/
                                        System.out.println("bien modifié : bien5 ");
                                        Bien bien = agence.choisirBien(5);
                                        agence.modifierBien(admin, bien);
                                        agence.afficher_liste_des_bien();
                                        /*GESTION DES MODFICATIONS*/
                                        System.out.println("************************calcul du prix apres modification************************************************\n\n");
                                    System.out.println(ConsoleColors.YELLOW_BOLD);
                                    System.out.println("$$$$$$$$$$$$$$$$\t    prix final :      " + bien.calculerprix());
                                    System.out.println(ConsoleColors.RESET );

                                    break;
                                case 5:
                                    break;
                            }
                                }while(choix != 5);

                                    } else{
                                    System.out.println("Identifiants errones");
                                }


                                break;

            }
        } while ((choix != 3));


    }
}