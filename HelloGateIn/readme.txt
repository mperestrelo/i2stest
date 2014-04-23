

GateIn
------

Deploy der Application: mvn jboss-as:deploy

Portlet-Seite einrichten
------------------------

1. Portal aufrufen: http://localhost:8080/portal/classic

2. Anmelden (Screenshot 01)
   Username: root
   Passwort: gtn

3. Portlet-Applikation installieren (muss deployed sein, siehe oben)
   3.1 Group -> Administration -> Applikationsverwaltung (Screenshot 02)
   3.2 Klick auf "Applikationen importieren" (Screenshot 03)
   3.3 Kontrolle: wird die Anwendung links unter "Kategorien angezeigt"? (Screenshot 04)

4. Seite anlegen
   4.1 Gruppen-Editor -> Neue Seite hinzufügen (Screenshot 05)
   4.2 Pfeil "Eine Stufe nach oben" (links im Baum) betätigen bis rechts ausgewählter Seitenknoten "/default" ist (Screenshot 06)
   4.3 Knotenname "JEE6minimal" eingeben und "Weiter" (Screenshot 07)
   4.4 "Weiter" (Screenshot 07)
   4.5 im Popup "Seitenbearbeitung" unter "Applikationen" das Portlet suchen undauf die Seite ziehen (Screenshot 08)
   4.6 Seite speichern (Screenshot 09)

Hinweise: 
- auf die angelegte Seite kann jederzeit durch Klick auf "JEE6minimal" navigiert werden
- wenn man auf der Seite ist, kommt man mit "Gruppen-Editor -> Seite bearbeiten" zurück in den Bearbeitungsmodus und kann die Seite ändern
