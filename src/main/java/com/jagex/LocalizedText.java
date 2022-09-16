package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class LocalizedText {

	public static LocalizedText DEVELOPER_CONSOLE_INTRO = new LocalizedText("This is the developer console. To close, press the `, ² or § keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten `, ² or § drücken.", "Ceci est la console de développement. Pour la fermer, appuyez sur les touches `, ² ou §.", "Este é o painel de controle do desenvolvedor. Para fechar, pressione `, ² ou §.");
	public static LocalizedText ERROR_EXECUTING_COMMAND = new LocalizedText("There was an error executing the command.", "Es gab einen Fehler beim Ausführen des Befehls.", "Une erreur s'est produite lors de l'exécution de la commande.", "Houve um erro quando o comando foi executado.");
	public static LocalizedText UNKNOWN_DEV_COMMAND = new LocalizedText("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ");
	public static LocalizedText CANCEL = new LocalizedText("Cancel", "Abbrechen", "Annuler", "Cancelar");
	public static LocalizedText DISCARD = new LocalizedText("Discard", "Ablegen", "Jeter", "Descartar");
	public static LocalizedText DISCARD_2 = new LocalizedText("Discard", "Ablegen", "Jeter", "Descartar");
	public static LocalizedText TAKE = new LocalizedText("Take", "Nehmen", "Prendre", "Pegar");
	public static LocalizedText DROP = new LocalizedText("Drop", "Fallen lassen", "Poser", "Largar");
	public static LocalizedText CONTINUE = new LocalizedText("Continue", "Weiter", "Continuer", "Continuar");
	public static LocalizedText aClass433_5309 = new LocalizedText("Your friends list is full (200 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.", "Votre liste d'amis est pleine (200 noms maximum).", "Sua lista de amigos está cheia. O limite é 200.");
	public static LocalizedText LOADING_PLEASE_WAIT = new LocalizedText("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
	public static LocalizedText PROFILING = new LocalizedText("Profiling...", "Profiling...", "Profilage...", "Profiling...");
	public static LocalizedText CONNECTION_LOST = new LocalizedText("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");
	public static LocalizedText ATTEMPTING_TO_REESTABLISH = new LocalizedText("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");
	public static LocalizedText CHECKING_FOR_UPDATES = new LocalizedText("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");
	public static LocalizedText FETCHING_UPDATES = new LocalizedText("Fetching Updates - ", "Lade Update - ", "Chargement des MAJ - ", "Carregando atualizações - ");
	public static LocalizedText LOADING = new LocalizedText("Loading...", "Lade...", "Chargement en cours...", "Carregando...");
	public static LocalizedText HAS_LOGGED_IN = new LocalizedText(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");
	public static LocalizedText HAS_LOGGED_OUT = new LocalizedText(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");
	public static LocalizedText UNABLE_TO_FIND = new LocalizedText("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");
	public static LocalizedText EXAMINE = new LocalizedText("Examine", "Untersuchen", "Examiner", "Examinar");
	public static LocalizedText ATTACK = new LocalizedText("Attack", "Angreifen", "Attaquer", "Atacar");
	public static LocalizedText CHOOSE_OPTION = new LocalizedText("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");
	public static LocalizedText MORE_OPTIONS = new LocalizedText(" more options", " weitere Optionen", " autres options", " mais opções");
	public static LocalizedText WALK_HERE = new LocalizedText("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");
	public static LocalizedText FACE_HERE = new LocalizedText("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");
	public static LocalizedText LEVEL_ = new LocalizedText("level: ", "Stufe: ", "niveau ", "nível: ");
	public static LocalizedText SKILL_ = new LocalizedText("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");
	public static LocalizedText RATING_ = new LocalizedText("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");
	public static LocalizedText PLEASE_WAIT = new LocalizedText("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...");
	public static LocalizedText aClass433_5315 = new LocalizedText(" ", ": ", " ", " ");
	public static LocalizedText aClass433_5294 = new LocalizedText("M", "M", "M", "M");
	public static LocalizedText aClass433_5304 = new LocalizedText("M", "M", "M", "M");
	public static LocalizedText aClass433_5296 = new LocalizedText("K", "T", "K", "K");
	public static LocalizedText aClass433_5297 = new LocalizedText("K", "T", "K", "K");
	public static LocalizedText aClass433_5299 = new LocalizedText("Self", "Mich", "Moi", "Eu");
	public static LocalizedText ALREADY_ON_FRIENDS_LIST = new LocalizedText(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");
	public static LocalizedText aClass433_5289 = new LocalizedText("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	public static LocalizedText aClass433_5302 = new LocalizedText(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");
	public static LocalizedText aClass433_5227 = new LocalizedText("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");
	public static LocalizedText aClass433_5238 = new LocalizedText("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");
	public static LocalizedText aClass433_5214 = new LocalizedText("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
	public static LocalizedText aClass433_5198 = new LocalizedText(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");
	public static LocalizedText aClass433_5308 = new LocalizedText("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");
	public static LocalizedText aClass433_5192 = new LocalizedText(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");
	public static LocalizedText aClass433_5310 = new LocalizedText("yellow:", "gelb:", "jaune:", "amarelo:");
	public static LocalizedText aClass433_5224 = new LocalizedText("red:", "rot:", "rouge:", "vermelho:");
	public static LocalizedText aClass433_5312 = new LocalizedText("green:", "grün:", "vert:", "verde:");
	public static LocalizedText aClass433_5313 = new LocalizedText("cyan:", "blaugrün:", "cyan:", "cyan:");
	public static LocalizedText aClass433_5314 = new LocalizedText("purple:", "lila:", "violet:", "roxo:");
	public static LocalizedText aClass433_5221 = new LocalizedText("white:", "weiss:", "blanc:", "branco:");
	public static LocalizedText aClass433_5194 = new LocalizedText("flash1:", "blinken1:", "clignotant1:", "flash1:");
	public static LocalizedText aClass433_5317 = new LocalizedText("flash2:", "blinken2:", "clignotant2:", "flash2:");
	public static LocalizedText aClass433_5318 = new LocalizedText("flash3:", "blinken3:", "clignotant3:", "brilho3:");
	public static LocalizedText aClass433_5319 = new LocalizedText("glow1:", "leuchten1:", "brillant1:", "brilho1:");
	public static LocalizedText aClass433_5320 = new LocalizedText("glow2:", "leuchten2:", "brillant2:", "brilho2:");
	public static LocalizedText aClass433_5199 = new LocalizedText("glow3:", "leuchten3:", "brillant3:", "brilho3:");
	public static LocalizedText aClass433_5292 = new LocalizedText("wave:", "welle:", "ondulation:", "onda:");
	public static LocalizedText aClass433_5323 = new LocalizedText("wave2:", "welle2:", "ondulation2:", "onda2:");
	public static LocalizedText aClass433_5324 = new LocalizedText("shake:", "schütteln:", "tremblement:", "tremor:");
	public static LocalizedText aClass433_5325 = new LocalizedText("scroll:", "scrollen:", "déroulement:", "rolagem:");
	public static LocalizedText aClass433_5326 = new LocalizedText("slide:", "gleiten:", "glissement:", "deslizamento:");
	static LocalizedText PLAYER_PLACEHOLDER = new LocalizedText("#Player", "#Spieler", "#Joueur", "#Jogador");
	static LocalizedText LOGIN_TO_MEMBERS_TO_USE = new LocalizedText("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	static LocalizedText BANK_NOTE_SWAP = new LocalizedText("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	static LocalizedText OK = new LocalizedText("Ok", "Okay", "OK", "Ok");
	static LocalizedText SELECT = new LocalizedText("Select", "Auswählen", "Sélectionner", "Selecionar");
	static LocalizedText INVALID_NAME = new LocalizedText("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	static LocalizedText YOU_CANT_REPORT_YOURSELF = new LocalizedText("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	static LocalizedText TOO_MANY_REPORTS = new LocalizedText("You have sent too many abuse reports today! Do not abuse this system!", "Du hast heute schon zu viele Regelverstöße gemeldet! Missbrauch das System nicht!", "Vous avez signalé trop d’abus pour aujourd’hui. N’abusez pas de ce système !", "Você já denunciou abuso muitas vezes hoje. Não abuse do sistema!");
	static LocalizedText YOU_CANNOT_REPORT = new LocalizedText("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	static LocalizedText JMOD_DESCRIPTION = new LocalizedText("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	static LocalizedText REPORT_UNDER_DIFF_RULE = new LocalizedText("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	static LocalizedText aClass433_5178 = new LocalizedText("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	static LocalizedText aClass433_5209 = new LocalizedText("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	static LocalizedText aClass433_5180 = new LocalizedText("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	static LocalizedText aClass433_5181 = new LocalizedText("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	static LocalizedText aClass433_5182 = new LocalizedText("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	static LocalizedText aClass433_5183 = new LocalizedText("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	static LocalizedText aClass433_5184 = new LocalizedText("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
	static LocalizedText aClass433_5185 = new LocalizedText("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	static LocalizedText aClass433_5186 = new LocalizedText("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	static LocalizedText aClass433_5208 = new LocalizedText("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	static LocalizedText aClass433_5298 = new LocalizedText("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	static LocalizedText aClass433_5189 = new LocalizedText("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	static LocalizedText aClass433_5190 = new LocalizedText("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	static LocalizedText aClass433_5283 = new LocalizedText("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	static LocalizedText aClass433_5193 = new LocalizedText("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	static LocalizedText aClass433_5258 = new LocalizedText("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	static LocalizedText aClass433_5284 = new LocalizedText("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	static LocalizedText aClass433_5196 = new LocalizedText(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	static LocalizedText aClass433_5197 = new LocalizedText("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	static LocalizedText aClass433_5265 = new LocalizedText(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	static LocalizedText aClass433_5263 = new LocalizedText("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	static LocalizedText aClass433_5200 = new LocalizedText("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
	static LocalizedText aClass433_5273 = new LocalizedText("Unable to send message - set your display name first by logging into the game.", "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ", "Impossible d'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.", "Não é possível enviar a mensagem. Defina um nome de personagem antes, fazendo login no jogo.");
	static LocalizedText aClass433_5202 = new LocalizedText(null, "indem du dich ins Spiel einloggst.", null, null);
	static LocalizedText aClass433_5203 = new LocalizedText("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	static LocalizedText aClass433_5204 = new LocalizedText(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	static LocalizedText aClass433_5205 = new LocalizedText("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	static LocalizedText aClass433_5206 = new LocalizedText("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	static LocalizedText aClass433_5201 = new LocalizedText(null, "geschickt werden.", null, null);
	static LocalizedText aClass433_5161 = new LocalizedText("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	static LocalizedText aClass433_5321 = new LocalizedText("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	static LocalizedText aClass433_5210 = new LocalizedText("friends_chat", "friends_chat", "friends_chat", "friends_chat");
	static LocalizedText aClass433_5328 = new LocalizedText("You are not currently in a friends chat channel.", "Du befindest dich derzeit nicht in einem Freundes-Chatraum.", "Vous ne faites pas partie d'un canal de discussion.", "No momento, você não está no bate-papo entre amigos.");
	static LocalizedText aClass433_5212 = new LocalizedText("You are not allowed to talk in this friends chat channel.", "Du darfst in diesem Freundes-Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de discussion.", "Você pode falar neste bate-papo entre amigos.");
	static LocalizedText aClass433_5213 = new LocalizedText("Error sending message to friends chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi de ce message – veuillez réessayer ultérieurement !", "Erro ao enviar mensagem para bate-papo entre amigos - favor tentar novamente mais tarde!");
	static LocalizedText aClass433_5288 = new LocalizedText("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	static LocalizedText aClass433_5215 = new LocalizedText("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	static LocalizedText aClass433_5216 = new LocalizedText("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
	static LocalizedText aClass433_5217 = new LocalizedText("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	static LocalizedText aClass433_5218 = new LocalizedText("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	static LocalizedText aClass433_5219 = new LocalizedText("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	static LocalizedText aClass433_5220 = new LocalizedText("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	static LocalizedText aClass433_5267 = new LocalizedText("Unable to join friends chat at this time - please try again later!", "Freundes-Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez réessayer ultérieurement !", "Não foi possível participar do bate-papo entre amigos - favor tentar novamente mais tarde!");
	static LocalizedText aClass433_5195 = new LocalizedText("Now talking in friends chat channel ", "Freundes-Chatraum: ", "Vous participez actuellement au canal de discussion : ", "Falando no momento no bate-papo entre amigos: ");
	static LocalizedText aClass433_5191 = new LocalizedText("Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ", "Vous participez actuellement au canal de discussion du joueur : ", "Falando no momento no bate-papo entre amigos do jogador: ");
	static LocalizedText aClass433_5235 = new LocalizedText("Error joining friends chat channel - please try again later!", "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de discussion - veuillez réessayer ultérieurement !", "Erro ao participar do bate-papo entre-amigos - favor tentar novamente mais tarde!");
	static LocalizedText aClass433_5225 = new LocalizedText("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	static LocalizedText aClass433_5226 = new LocalizedText("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	static LocalizedText aClass433_5211 = new LocalizedText("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	static LocalizedText aClass433_5228 = new LocalizedText("You do not have a high enough rank to join this friends chat channel.", "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de discussion.", "Você não tem uma classificação alta o suficiente para participar deste bate-papo entre amigos.");
	static LocalizedText aClass433_5229 = new LocalizedText("You are temporarily banned from this friends chat channel.", "Du wurdest temporär von diesem Freundes-Chatraum gesperrt.", "Vous avez été exclu temporairement de ce canal de discussion.", "Você foi temporariamente banido deste bate-papo entre amigos.");
	static LocalizedText aClass433_5230 = new LocalizedText("You are not allowed to join this user's friends chat channel.", "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de discussion de cet utilisateur.", "Você não pode participar do bate-papo entre amigos deste usuário.");
	static LocalizedText aClass433_5207 = new LocalizedText(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	static LocalizedText aClass433_5259 = new LocalizedText(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
	static LocalizedText aClass433_5233 = new LocalizedText(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	static LocalizedText aClass433_5234 = new LocalizedText("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	static LocalizedText aClass433_5293 = new LocalizedText("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
	static LocalizedText aClass433_5236 = new LocalizedText("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	static LocalizedText aClass433_5237 = new LocalizedText("Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.", "Votre canal de discussion est maintenant activé !", "O seu bate-papo entre amigos foi ativado!");
	static LocalizedText aClass433_5163 = new LocalizedText("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	static LocalizedText aClass433_5172 = new LocalizedText("Your friends chat channel has now been disabled!", "Dein Freundes-Chat ist jetzt ausgeschaltet.", "Votre canal de discussion est maintenant désactivé !", "O seu bate-papo entre amigos foi desativado!");
	static LocalizedText aClass433_5231 = new LocalizedText("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	static LocalizedText aClass433_5241 = new LocalizedText("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	static LocalizedText aClass433_5242 = new LocalizedText("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	static LocalizedText aClass433_5222 = new LocalizedText("Your request to kick/ban this user was successful.", "Der Rauswurf/die Sperrung war erfolgreich.", "Votre demande d'exclusion de ce joueur a été acceptée.", "Seu pedido para expulsar/suspender este jogador foi bem sucedido.");
	static LocalizedText aClass433_5244 = new LocalizedText("Your request to refresh this user's temporary ban was successful.", "Die Verlängerung der temporären Sperrung dieses Spielers war erfolgreich.", "Le renouvellement d'exclusion temporaire de ce joueur a été accepté.", "Seu pedido para reiniciar a suspensão temporária deste jogador foi bem sucedido.");
	static LocalizedText aClass433_5303 = new LocalizedText("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
	static LocalizedText aClass433_5246 = new LocalizedText("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	static LocalizedText aClass433_5247 = new LocalizedText(" days.", " Tage.", " jours.", " dias.");
	static LocalizedText aClass433_5248 = new LocalizedText("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	static LocalizedText aClass433_5249 = new LocalizedText("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	static LocalizedText PERMANENTLY_MUTED = new LocalizedText("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	static LocalizedText LOADING_CONFIG = new LocalizedText("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");
	static LocalizedText LOADED_CONFIG = new LocalizedText("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");
	static LocalizedText LOADING_SPRITES = new LocalizedText("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");
	static LocalizedText LOADED_SPRITES = new LocalizedText("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
	static LocalizedText LOADING_WORDPACK = new LocalizedText("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");
	static LocalizedText LOADED_WORDPACK = new LocalizedText("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");
	static LocalizedText LOADING_INTERFACES = new LocalizedText("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");
	static LocalizedText LOADED_INTERFACES = new LocalizedText("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");
	static LocalizedText LOADING_INTERFACE_SCRIPTS = new LocalizedText("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
	static LocalizedText LOADED_INTERFACE_SCRIPTS = new LocalizedText("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");
	static LocalizedText LOADING_ADDITIONAL_FONTS = new LocalizedText("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");
	static LocalizedText LOADED_ADDITIONAL_FONTS = new LocalizedText("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	static LocalizedText LOADING_WORLD_MAP = new LocalizedText("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");
	static LocalizedText LOADED_WORLD_MAP = new LocalizedText("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");
	static LocalizedText LOADING_WORLDLIST_DATA = new LocalizedText("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	static LocalizedText LOADED_WORLDLIST_DATA = new LocalizedText("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	static LocalizedText LOADED_CLIENTVAR_DATA = new LocalizedText("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
	static LocalizedText aClass433_5275 = new LocalizedText("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	static LocalizedText aClass433_5276 = new LocalizedText(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	static LocalizedText SYSTEM_UPDATE = new LocalizedText("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	static LocalizedText USE = new LocalizedText("Use", "Benutzen", "Utiliser", "Usar");
	static LocalizedText aClass433_5239 = new LocalizedText("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	static LocalizedText aClass433_5261 = new LocalizedText("From", "Von:", "De", "De");
	static LocalizedText aClass433_5305 = new LocalizedText("Changes will take effect on your friends chat in the next 60 seconds.", "Die Änderungen am Freundes-Chat werden innerhalb von 60 Sekunden übernommen.", "Les modifications seront apportés à votre canal de discussion dans les 60 prochaines secondes.", "Mundanças vão ocorrer em seu bate-papo entre amigos nos próximos 60 segundos.");
	static LocalizedText aClass433_5327 = new LocalizedText("Friend", "Freund", "Ami", "Amigo");

	public static Node_Sub15_Sub2 method7272() {
		return Class148.aNode_Sub15_Sub2_1735;
	}

	static void method7275(AbstractRenderer graphicalrenderer_0) {
		if (Class187.anInt2351 != VertexNormal.MY_PLAYER.plane && IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager() != null) {
			Utils.time();
			if (AsyncOutputStream.method5097(graphicalrenderer_0, VertexNormal.MY_PLAYER.plane))
				Class187.anInt2351 = VertexNormal.MY_PLAYER.plane;
		}
	}

	Map<Language, String> aMap5279 = new HashMap<>(6);

	LocalizedText(String string_1, String string_2, String string_3, String string_4) {
		aMap5279.put(Language.ENGLISH, string_1);
		aMap5279.put(Language.GERMAN, string_2);
		aMap5279.put(Language.FRENCH, string_3);
		aMap5279.put(Language.PORTUGESE, string_4);
	}

	public String translate(Language xlanguage_1) {
		return aMap5279.get(xlanguage_1);
	}
}
