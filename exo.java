/* Programme à réaliser :
 
[Réception d'un message électronique] 
 
Lorsqu’un email est réceptionné par un serveur de messagerie, quelques vérifications sont nécessaires avant que l’email soit transmis à son destinataire final.  
 
Il est indispensable de contrôler que l’adresse email du destinataire existe et que la boite de réception du destinataire dispose de suffisamment d’espace disponible. Une analyse antivirus est systématiquement faite sur les pièces jointes (le serveur n’accepte que les pièces jointes inférieures à 25Mo).  
 
Si toutes les contrôles sont satisfaisants, l’email est transmis au destinataire.  
 
Le destinataire a peut-être activé un message d’absence (réponse automatique). Si tel est le cas, celui-ci est transmis à l’expéditeur. */



public class exo {
    public static void main(String[] args) {
                
        String EmailDesti = "Caroline.XXXXXXX@wwwwwwww.ccc"; //entre le mail destinataire
        String verifEmailDesti = "Caroline.XXXXXXX@wwwww.ccc"; // On vérifie si elle est valide.
        int reponse;

        int DestiEspace = 35; // Espace disponible dans la boite mail
        int Destiverifemail = 20; // verification du mail

        int analyseAV = 25; // L'analyse antivirus n'accepte pas les PJ inférieur à 25 Mo 
        int Pj = 30; // PJ a 30 mo.

        
        

        if (Destiverifemail < DestiEspace && Pj >= analyseAV ){

            System.out.println(EmailDesti.equals(verifEmailDesti));
            System.out.println("Envoi du mail");




        } else {
            System.out.println("Non envoi du mail");
        }
        

    }








}
