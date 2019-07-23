import java.util.HashMap;
import java.util.Map;

public class Message {

	public static Message DEVELOPER_CONSOLE_INTRO = new Message("This is the developer console. To close, press the `, ² or § keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten `, ² or § drücken.", "Ceci est la console de développement. Pour la fermer, appuyez sur les touches `, ² ou §.", "Este é o painel de controle do desenvolvedor. Para fechar, pressione `, ² ou §.");
	public static Message ERROR_EXECUTING_COMMAND = new Message("There was an error executing the command.", "Es gab einen Fehler beim Ausführen des Befehls.", "Une erreur s\'est produite lors de l\'exécution de la commande.", "Houve um erro quando o comando foi executado.");
	public static Message UNKNOWN_DEV_COMMAND = new Message("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ");
	public static Message CANCEL = new Message("Cancel", "Abbrechen", "Annuler", "Cancelar");
	static Message PLAYER_PLACEHOLDER = new Message("#Player", "#Spieler", "#Joueur", "#Jogador");
	static Message LOGIN_TO_MEMBERS_TO_USE = new Message("Login to a members\' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d\'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	static Message BANK_NOTE_SWAP = new Message("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l\'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	public static Message DISCARD = new Message("Discard", "Ablegen", "Jeter", "Descartar");
	public static Message DISCARD_2 = new Message("Discard", "Ablegen", "Jeter", "Descartar");
	public static Message TAKE = new Message("Take", "Nehmen", "Prendre", "Pegar");
	public static Message DROP = new Message("Drop", "Fallen lassen", "Poser", "Largar");
	static Message OK = new Message("Ok", "Okay", "OK", "Ok");
	static Message SELECT = new Message("Select", "Auswählen", "Sélectionner", "Selecionar");
	public static Message CONTINUE = new Message("Continue", "Weiter", "Continuer", "Continuar");
	static Message INVALID_NAME = new Message("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	static Message YOU_CANT_REPORT_YOURSELF = new Message("You can\'t report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	static Message TOO_MANY_REPORTS = new Message("You have sent too many abuse reports today! Do not abuse this system!", "Du hast heute schon zu viele Regelverstöße gemeldet! Missbrauch das System nicht!", "Vous avez signalé trop d’abus pour aujourd’hui. N’abusez pas de ce système !", "Você já denunciou abuso muitas vezes hoje. Não abuse do sistema!");
	static Message YOU_CANNOT_REPORT = new Message("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d\'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	static Message JMOD_DESCRIPTION = new Message("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	static Message REPORT_UNDER_DIFF_RULE = new Message("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	static Message aClass433_5178 = new Message("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d\'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	static Message aClass433_5209 = new Message("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	static Message aClass433_5180 = new Message("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	static Message aClass433_5181 = new Message("To use this item please login to a members\' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d\'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	static Message aClass433_5182 = new Message("To interact with this please login to a members\' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d\'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	static Message aClass433_5183 = new Message("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d\'intéressant.", "Nada de interessante acontece.");
	static Message aClass433_5184 = new Message("You can\'t reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l\'atteindre.", "Você não consegue alcançar isso.");
	static Message aClass433_5185 = new Message("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	static Message aClass433_5186 = new Message("To go here you must login to a members\' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d\'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	static Message aClass433_5208 = new Message("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d\'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	static Message aClass433_5298 = new Message("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d\'ajouter l\'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	static Message aClass433_5189 = new Message("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d\'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	static Message aClass433_5190 = new Message("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d\'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	public static Message aClass433_5309 = new Message("Your friends list is full (200 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.", "Votre liste d\'amis est pleine (200 noms maximum).", "Sua lista de amigos está cheia. O limite é 200.");
	static Message aClass433_5283 = new Message("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	static Message aClass433_5193 = new Message("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d\'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	static Message aClass433_5258 = new Message("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d\'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	static Message aClass433_5284 = new Message("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d\'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	static Message aClass433_5196 = new Message((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
	static Message aClass433_5197 = new Message("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d\'envoyer un message - joueur non inclus dans votre liste d\'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	static Message aClass433_5265 = new Message((String) null, "Spieler nicht auf deiner Freunde-Liste.", (String) null, (String) null);
	static Message aClass433_5263 = new Message("You appear to be telling someone your password - please don\'t!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu\'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	static Message aClass433_5200 = new Message("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n\'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	static Message aClass433_5273 = new Message("Unable to send message - set your display name first by logging into the game.", "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ", "Impossible d\'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.", "Não é possível enviar a mensagem. Defina um nome de personagem antes, fazendo login no jogo.");
	static Message aClass433_5202 = new Message((String) null, "indem du dich ins Spiel einloggst.", (String) null, (String) null);
	static Message aClass433_5203 = new Message("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n\'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	static Message aClass433_5204 = new Message((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
	static Message aClass433_5205 = new Message("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	static Message aClass433_5206 = new Message("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d\'envoyer un message rapide à un joueur de ce serveur à l\'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	static Message aClass433_5201 = new Message((String) null, "geschickt werden.", (String) null, (String) null);
	static Message aClass433_5161 = new Message("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	static Message aClass433_5321 = new Message("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	static Message aClass433_5210 = new Message("friends_chat", "friends_chat", "friends_chat", "friends_chat");
	static Message aClass433_5328 = new Message("You are not currently in a friends chat channel.", "Du befindest dich derzeit nicht in einem Freundes-Chatraum.", "Vous ne faites pas partie d\'un canal de discussion.", "No momento, você não está no bate-papo entre amigos.");
	static Message aClass433_5212 = new Message("You are not allowed to talk in this friends chat channel.", "Du darfst in diesem Freundes-Chatraum nicht reden.", "Vous n\'êtes pas autorisé à parler dans ce canal de discussion.", "Você pode falar neste bate-papo entre amigos.");
	static Message aClass433_5213 = new Message("Error sending message to friends chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l\'envoi de ce message – veuillez réessayer ultérieurement !", "Erro ao enviar mensagem para bate-papo entre amigos - favor tentar novamente mais tarde!");
	static Message aClass433_5288 = new Message("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d\'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	static Message aClass433_5215 = new Message("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n\'êtes dans aucun canal à l\'heure actuelle.", "No momento você não está em um canal.");
	static Message aClass433_5216 = new Message("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	static Message aClass433_5217 = new Message("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	static Message aClass433_5218 = new Message("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	static Message aClass433_5219 = new Message("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	static Message aClass433_5220 = new Message("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	static Message aClass433_5267 = new Message("Unable to join friends chat at this time - please try again later!", "Freundes-Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez réessayer ultérieurement !", "Não foi possível participar do bate-papo entre amigos - favor tentar novamente mais tarde!");
	static Message aClass433_5195 = new Message("Now talking in friends chat channel ", "Freundes-Chatraum: ", "Vous participez actuellement au canal de discussion : ", "Falando no momento no bate-papo entre amigos: ");
	static Message aClass433_5191 = new Message("Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ", "Vous participez actuellement au canal de discussion du joueur : ", "Falando no momento no bate-papo entre amigos do jogador: ");
	static Message aClass433_5235 = new Message("Error joining friends chat channel - please try again later!", "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de discussion - veuillez réessayer ultérieurement !", "Erro ao participar do bate-papo entre-amigos - favor tentar novamente mais tarde!");
	static Message aClass433_5225 = new Message("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	static Message aClass433_5226 = new Message("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n\'existe pas.", "O canal que você tentou acessar não existe.");
	static Message aClass433_5211 = new Message("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	static Message aClass433_5228 = new Message("You do not have a high enough rank to join this friends chat channel.", "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.", "Votre rang n\'est pas assez élevé pour rejoindre ce canal de discussion.", "Você não tem uma classificação alta o suficiente para participar deste bate-papo entre amigos.");
	static Message aClass433_5229 = new Message("You are temporarily banned from this friends chat channel.", "Du wurdest temporär von diesem Freundes-Chatraum gesperrt.", "Vous avez été exclu temporairement de ce canal de discussion.", "Você foi temporariamente banido deste bate-papo entre amigos.");
	static Message aClass433_5230 = new Message("You are not allowed to join this user\'s friends chat channel.", "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.", "Vous n\'êtes pas autorisé à rejoindre le canal de discussion de cet utilisateur.", "Você não pode participar do bate-papo entre amigos deste usuário.");
	static Message aClass433_5207 = new Message(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	static Message aClass433_5259 = new Message(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	static Message aClass433_5233 = new Message(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	static Message aClass433_5234 = new Message("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	static Message aClass433_5293 = new Message("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	static Message aClass433_5236 = new Message("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	static Message aClass433_5237 = new Message("Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.", "Votre canal de discussion est maintenant activé !", "O seu bate-papo entre amigos foi ativado!");
	static Message aClass433_5163 = new Message("Join your channel by clicking \'Join Chat\' and typing: ", "Klick auf \'Betreten\' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	static Message aClass433_5172 = new Message("Your friends chat channel has now been disabled!", "Dein Freundes-Chat ist jetzt ausgeschaltet.", "Votre canal de discussion est maintenant désactivé !", "O seu bate-papo entre amigos foi desativado!");
	static Message aClass433_5231 = new Message("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n\'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	static Message aClass433_5241 = new Message("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n\'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	static Message aClass433_5242 = new Message("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n\'est pas dans ce canal.", "Esse usuário não está no canal.");
	static Message aClass433_5222 = new Message("Your request to kick/ban this user was successful.", "Der Rauswurf/die Sperrung war erfolgreich.", "Votre demande d\'exclusion de ce joueur a été acceptée.", "Seu pedido para expulsar/suspender este jogador foi bem sucedido.");
	static Message aClass433_5244 = new Message("Your request to refresh this user\'s temporary ban was successful.", "Die Verlängerung der temporären Sperrung dieses Spielers war erfolgreich.", "Le renouvellement d\'exclusion temporaire de ce joueur a été accepté.", "Seu pedido para reiniciar a suspensão temporária deste jogador foi bem sucedido.");
	static Message aClass433_5303 = new Message("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	static Message aClass433_5246 = new Message("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	static Message aClass433_5247 = new Message(" days.", " Tage.", " jours.", " dias.");
	static Message aClass433_5248 = new Message("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	static Message aClass433_5249 = new Message("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	static Message PERMANENTLY_MUTED = new Message("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L\'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	public static Message LOADING_PLEASE_WAIT = new Message("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
	public static Message PROFILING = new Message("Profiling...", "Profiling...", "Profilage...", "Profiling...");
	public static Message CONNECTION_LOST = new Message("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");
	public static Message ATTEMPTING_TO_REESTABLISH = new Message("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");
	public static Message CHECKING_FOR_UPDATES = new Message("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");
	public static Message FETCHING_UPDATES = new Message("Fetching Updates - ", "Lade Update - ", "Chargement des MAJ - ", "Carregando atualizações - ");
	static Message LOADING_CONFIG = new Message("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
	static Message LOADED_CONFIG = new Message("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");
	static Message LOADING_SPRITES = new Message("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
	static Message LOADED_SPRITES = new Message("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
	static Message LOADING_WORDPACK = new Message("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
	static Message LOADED_WORDPACK = new Message("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");
	static Message LOADING_INTERFACES = new Message("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");
	static Message LOADED_INTERFACES = new Message("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");
	static Message LOADING_INTERFACE_SCRIPTS = new Message("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
	static Message LOADED_INTERFACE_SCRIPTS = new Message("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");
	static Message LOADING_ADDITIONAL_FONTS = new Message("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");
	static Message LOADED_ADDITIONAL_FONTS = new Message("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	static Message LOADING_WORLD_MAP = new Message("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");
	static Message LOADED_WORLD_MAP = new Message("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");
	static Message LOADING_WORLDLIST_DATA = new Message("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	static Message LOADED_WORLDLIST_DATA = new Message("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	static Message LOADED_CLIENTVAR_DATA = new Message("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
	public static Message LOADING = new Message("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
	static Message aClass433_5275 = new Message("Please close the interface you have open before using \'Report Abuse\'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l\'interface que vous avez ouverte avant d\'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	static Message aClass433_5276 = new Message((String) null, "bevor du die Option \'Regelverstoß melden\' benutzt.", (String) null, (String) null);
	static Message SYSTEM_UPDATE = new Message("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	public static Message HAS_LOGGED_IN = new Message(" has logged in.", " loggt sich ein.", " s\'est connecté.", " entrou no jogo.");
	public static Message HAS_LOGGED_OUT = new Message(" has logged out.", " loggt sich aus.", " s\'est déconnecté.", " saiu do jogo.");
	public static Message UNABLE_TO_FIND = new Message("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");
	static Message USE = new Message("Use", "Benutzen", "Utiliser", "Usar");
	public static Message EXAMINE = new Message("Examine", "Untersuchen", "Examiner", "Examinar");
	public static Message ATTACK = new Message("Attack", "Angreifen", "Attaquer", "Atacar");
	public static Message CHOOSE_OPTION = new Message("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");
	public static Message MORE_OPTIONS = new Message(" more options", " weitere Optionen", " autres options", " mais opções");
	public static Message WALK_HERE = new Message("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");
	public static Message FACE_HERE = new Message("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");
	public static Message LEVEL_ = new Message("level: ", "Stufe: ", "niveau ", "nível: ");
	public static Message SKILL_ = new Message("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
	public static Message RATING_ = new Message("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");
	public static Message PLEASE_WAIT = new Message("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...");
	static Message aClass433_5239 = new Message("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l\'interface que vous avez ouverte avant d\'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	public static Message aClass433_5315 = new Message(" ", ": ", " ", " ");
	public static Message aClass433_5294 = new Message("M", "M", "M", "M");
	public static Message aClass433_5304 = new Message("M", "M", "M", "M");
	public static Message aClass433_5296 = new Message("K", "T", "K", "K");
	public static Message aClass433_5297 = new Message("K", "T", "K", "K");
	static Message aClass433_5261 = new Message("From", "Von:", "De", "De");
	public static Message aClass433_5299 = new Message("Self", "Mich", "Moi", "Eu");
	public static Message ALREADY_ON_FRIENDS_LIST = new Message(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d\'amis.", " já está na sua lista de amigos.");
	public static Message aClass433_5289 = new Message("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	public static Message aClass433_5302 = new Message(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");
	public static Message aClass433_5227 = new Message("You can\'t add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d\'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
	public static Message aClass433_5238 = new Message("You can\'t add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");
	static Message aClass433_5305 = new Message("Changes will take effect on your friends chat in the next 60 seconds.", "Die Änderungen am Freundes-Chat werden innerhalb von 60 Sekunden übernommen.", "Les modifications seront apportés à votre canal de discussion dans les 60 prochaines secondes.", "Mundanças vão ocorrer em seu bate-papo entre amigos nos próximos 60 segundos.");
	public static Message aClass433_5214 = new Message("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
	public static Message aClass433_5198 = new Message(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");
	public static Message aClass433_5308 = new Message("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
	public static Message aClass433_5192 = new Message(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d\'amis.", " da sua lista de amigos primeiro.");
	public static Message aClass433_5310 = new Message("yellow:", "gelb:", "jaune:", "amarelo:");
	public static Message aClass433_5224 = new Message("red:", "rot:", "rouge:", "vermelho:");
	public static Message aClass433_5312 = new Message("green:", "grün:", "vert:", "verde:");
	public static Message aClass433_5313 = new Message("cyan:", "blaugrün:", "cyan:", "cyan:");
	public static Message aClass433_5314 = new Message("purple:", "lila:", "violet:", "roxo:");
	public static Message aClass433_5221 = new Message("white:", "weiss:", "blanc:", "branco:");
	public static Message aClass433_5194 = new Message("flash1:", "blinken1:", "clignotant1:", "flash1:");
	public static Message aClass433_5317 = new Message("flash2:", "blinken2:", "clignotant2:", "flash2:");
	public static Message aClass433_5318 = new Message("flash3:", "blinken3:", "clignotant3:", "brilho3:");
	public static Message aClass433_5319 = new Message("glow1:", "leuchten1:", "brillant1:", "brilho1:");
	public static Message aClass433_5320 = new Message("glow2:", "leuchten2:", "brillant2:", "brilho2:");
	public static Message aClass433_5199 = new Message("glow3:", "leuchten3:", "brillant3:", "brilho3:");
	public static Message aClass433_5292 = new Message("wave:", "welle:", "ondulation:", "onda:");
	public static Message aClass433_5323 = new Message("wave2:", "welle2:", "ondulation2:", "onda2:");
	public static Message aClass433_5324 = new Message("shake:", "schütteln:", "tremblement:", "tremor:");
	public static Message aClass433_5325 = new Message("scroll:", "scrollen:", "déroulement:", "rolagem:");
	public static Message aClass433_5326 = new Message("slide:", "gleiten:", "glissement:", "deslizamento:");
	static Message aClass433_5327 = new Message("Friend", "Freund", "Ami", "Amigo");

	Map aMap5279 = new HashMap(6);

	Message(String string_1, String string_2, String string_3, String string_4) {
		this.aMap5279.put(Language.ENGLISH, string_1);
		this.aMap5279.put(Language.GERMAN, string_2);
		this.aMap5279.put(Language.FRENCH, string_3);
		this.aMap5279.put(Language.PORTUGESE, string_4);
	}

	public static Node_Sub15_Sub2 method7272() {
		return Class148.aNode_Sub15_Sub2_1735;
	}

	public String translate(Language xlanguage_1) {
		return (String) this.aMap5279.get(xlanguage_1);
	}

	static void method7275(GraphicalRenderer graphicalrenderer_0) {
		if (Class187.anInt2351 != VertexNormal.MY_PLAYER.plane && IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
			Utils.time();
			if (AsyncOutputStream.method5097(graphicalrenderer_0, VertexNormal.MY_PLAYER.plane)) {
				Class187.anInt2351 = VertexNormal.MY_PLAYER.plane;
			}
		}
	}

	public static void method7278(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(21, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) 33);
	}
}
