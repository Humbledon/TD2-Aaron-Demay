# TD2-Aaron-Demay
TD Java
Exercice 1 
1) Pour la mere qui est de la classe, le main va afficher 42 car la fonction Meth() retourne 42.  Cela est du au polymorsphisme.
Pour la fille et la mereFille qui sont toutes deux de la classe fille, le main va afficher 24 car l'utilisation du extends dans la classe fille fait que Meth() va désormais retourner 24.
2)S'il est dans Fille, un objet de type Fille a accès à 1 méthode meth(). S'il est dans Main, il a accès à deux méthodes meth().
3) On pourra accéder à la méthode meth() sans instancier de classe Mere ou fille. Les méthodes statiques ne pourront par contre pas être redéfinies.
Exercice 2 
1) Les erreurs de compilation sont liées au fait que :
- la méthode miage n'est pas défini pour la classe Mere. 
-La fonction d() foit etre appellée de manière statique
3) On appelle redifinition lorsqu'on crée une sous-classe puis on lui créee une fonction avec le même nom et les mêmes arguments qu'une fonction dans la classe de base. Dans ce cas, la fonction dela sous-classe sera exécutée.
La surcharge de fonction a lieu dans une seule classe avec un même nom de fonctions mais un ensemble d'arguments différents.
-c(Mere mere) est une surcharge de la fonction c() dans la classe Mere car c() est dans la même classe mais avec des paramètres différents.
-public void a(), b(), c(), d(), e(), f(), g(), h(), i(), j(), k() , l(), m() sont des redéfinitions car il existe des méthodes avec les mêmes noms et les mêmes paramètres dans la classe mère Mere.
- void c(Fille b) {System.out.println("Fille_c(Fille)"); } est une surcharge dela fonction c() dans la classe Fille.

4) 
	Mere mere=new Mere();
		Mere mereFille=new Fille();
Création d'un objet de type mère de classe Fille 
		Fille fille=new Fille();
Création d'un objet de type fille de classe fille
		//mere.miage();
		fille.miage();
Appelle de la fonction miage qui est dans la classe fille et qui retourne "Miage". 
		//mereFille.miage();
		((Fille)mereFille).miage();

		mere.a();
Appelle de la fonction a() qui se trouve dans Mere et qui print("Mere_a")
		mereFille.a();
Appelle de la fonction a() qui se trouve dans Fille quiprint("Fille_a")

		fille.a();
Appelle de la fonction a() qui se trouve dans Fille quiprint("Fille_a")
		((Mere)mereFille).a();

		mereFille.b(null);

		mereFille.c();
Appelle de la fonction c qui se trouve dans Fille quiprint("Fille_a"). En effet, on prend le type de mereFille qui est Mere.
		mereFille.c(mere);
Appelle de la fonction c qui se trouve dans Fille quiprint("Fille_a"). En effet, on prend le type de mereFille qui est Mere.
		mereFille.c(mereFille);
		mereFille.c(fille);

		//mere.d();
		//mereFille.d();

		mere.printF();
		mereFille.printF();

		mereFille.j();
		mereFille.k();
		mereFille.l();
		mereFille.m();




