TD2 Java : Aaron Demay
1)	Voici ce qu’affiche le main :
42
42
24
24
24
24
On remarque que « fille.meth » retourne 24 car elle a été redifinie.
On remarque également que merefille.meth() renvoie 24 car la variable est de type fille.
2)Dans Fille il peut faire appel à super.meth() et meth(). Alors que s’il est dans Main, il peut appel à une méthode meth(à
3) Si les méthode meth sont statiques, on obtient ceci : 
42
42
24
42
42 (On obtient 42 car l’appel prend en compte le type de la variable)
42
4) Si meth sont des champs, on obtient désormais ceci :
42
42
24
42
42
42
Exercice 2
1)	On remarque que la méthode i() de fille retourne un int alors que la méthode i de Mère ne retourne rien
La méthode h() dans fille retourne un String alors que dans la méthode Mère, elle retourne un Integer
On remarque que la méthode e est de type private dans la classe Fille mais de type protected dans la classe Mère -> Cela pose problème car cela réduit la visibilité 
On remarque que miage() n’est pas définie dans la classe Mère.
K() ne renvoie pas le même type d’exception dans la classe Mère que dans la classe Fille (IOexception est dans Exception mais pas l’inverse)
merefille est dans une variable de type Mere et ne trouve donc pas la fonction miage()
3) On appelle redifinition lorsqu'on crée une sous-classe puis on lui créee une fonction avec le même nom et les mêmes arguments qu'une fonction dans la classe de base. Dans ce cas, la fonction dela sous-classe sera exécutée.
La surcharge de fonction a lieu dans une seule classe avec un même nom de fonctions mais un ensemble d'arguments différents.
Les redéfinitions sont :
a() de la classe fille redéfinit le a() de la classe mere
b() de la classe fille redéfinit le b() de la classe mere
c(Mere) 
f() de la classe fille redéfinit le f() de la classe mere









