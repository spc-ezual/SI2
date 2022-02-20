package listeInt

case class UnknownId() extends Exception
case class ListVide() extends Exception

sealed trait ListInt {
  /**
   * @param Lis liste a concaténer
   * @return concaténation des 2 liste
   * @note La liste en argument est placer en seconde
   */
  def +(Lis: ListInt): ListInt
  
  /**
   * @return Si la liste est vide
   */
  def isEmpty: Boolean
  
  /**
   *
   * @return Nombre d'élément que contient la liste
   */
  def len(): Int
  
  /**
   *
   * @return Represation de la liste sous forme de chaine de caractere
   *         @note [E1, E2, ...,En]
   */
  def toString: String
  
  /**
   *
   * @param List liste a comparer
   * @return Si les 2 liste sont égal
   */
  def equals(List: ListInt): Boolean
  
  /**
   *
   * @param e Element a rechercher
   * @return Si l'element e est contenue dans la liste
   */
  def contain(e: Int): Boolean
  
  /**
   *
   * @return liste retourner
   */
  def reverse: ListInt
  
  /**
   *
   * @param f Fonction a applique a chacun des element de la liste
   * @tparam U Peut etre de n'importe quelle type
   */
  def foreach[U](f:Int => U ): Unit
  
  /**
   *
   * @param id indice de l'element a recuperer
   * @return l'element a la place Id
   *         @note provoque une erreur du type : UnknownId
   *               Si l'indice n'hesiste pas
   */
  def get(id:Int):Int
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return le reste de la liste sans les n permier
   */
  def drop(n:Int):ListInt
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return la liste sans les n dernier element
   */
  def dropRight(n:Int):ListInt
  
  /**
   *
   * @param f fonction utiliser pour verifer les element
   * @return  la liste des element qui ne satisfont pas f
   */
  def dropWhile(f:Int => Boolean):ListInt
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return liste des n premier element
   */
  def take(n:Int):ListInt
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return liste des element qui ce situe apres les n premiere element
   */
  def takeRight(n:Int):ListInt
  /**
   *
   * @param f fonction utiliser pour verifer les element
   * @return  la liste des element qui satisfont f
   */
  def takeWhile(f:Int=>Boolean):ListInt
  
  /**
   *
   * @param from le permier indice a inclure dans la liste
   * @param until le premier indice a exclure dans la liste
   * @return liste de from a until non inclus
   */
  def slice(from :Int,until:Int):ListInt
  
  /**
   *
   * @param n entier a ajouter
   * @return liste avec l'element n en plus
   */
  def add(n:Int):ListInt
  
  /**
   *
   * @param f le prédicat utilisé pour tester les éléments.
   * @return le nombre d'éléments satisfaisant le prédicat f (tel que déterminé par ==)
   */
  def count(f:Int=>Boolean):Int
  
  /**
   *
   * @return une nouvelle séquence Constituée de tous les éléments de cette séquence sans doublons
   */
  def distinct:ListInt
  
  /**
   *
   * @param f Fonction de transformation
   * @return  une nouvelle séquence Constituée de tous les éléments de cette séquence après application de la fonction de transformation f sans doublons
   */
  def distinctBy(f:Int=> Int):ListInt
  
  /**
   *
   * @param f fonction a tester
   * @return une nouvelle séquence Constituée de tous les éléments qui satifont f
   */
  def filter(f:Int => Boolean):ListInt
  /**
   *
   * @param f fonction a tester
   * @return une nouvelle séquence Constituée de tous les éléments qui ne satifont pas f
   */
  def filterNot(f:Int => Boolean):ListInt
  
  /**
   *
   * @param f fonction a tester
   * @return une valeur en option contenant le premier élément de la liste qui satisfait p, ou None s'il n'en existe pas.
   */
  def find(f:Int => Boolean):Option[Int]
  
  /**
   *
   * @param f fonction a tester
   * @return une valeur en option contenant le dernier élément de la liste qui satisfait p, ou None s'il n'en existe pas.
   */
  def findLast(f:Int => Boolean):Option[Int]
  
  /**
   *
   * @param f fonction a tester
   * @return Si tous les element de la liste verifie f
   */
  def forAll(f:Int => Boolean):Boolean
  
  /**
   *
   * @return en option le premiere element ou None
   */
  def headOption:Option[Int]
  
  /**
   *
   * @param e element a trouver
   * @return l'index >= 0 du premier élément de cette séquence qui est égal (tel que déterminé par ==) à e, ou -1, s'il n'en existe pas.
   */
  def indexOf(e:Int):Int
  
  /**
   * @param e element a trouver
   * @param Id premier indice a tester
   * @return l'index >= Id, du premier élément de cette séquence qui est égal (tel que déterminé par ==) à e, ou -1, s'il n'en existe pas.
   */
  def indexOf(e:Int,Id:Int):Int
  
  /**
   *
   * @param sousL sous-séquence
   * @return le premier index >=0, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def indexOfSlice(sousL:ListInt):Int
  
  /**
   *
   * @param sousL sous-séquence
   * @param Id premier indice a tester
   * @return le premier index >= Id, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def indexOfSlice(sousL:ListInt,Id:Int):Int
  
  /**
   *
   * @param f fonction a tester
   * @return l'indice >=0, du premier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def indexWhere(f:Int=>Boolean):Int
  
  /**
   *
   * @param f fonction a tester
   * @param Id premier indice a tester
   * @return l'indice >=0, du premier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def indexWhere(f:Int=>Boolean,Id:Int):Int
  
  /**
   *
   * @return Le dernier élément de cette liste -1 si vide
   */
  def last:Int
  
  /**
   * @param e element a trouver
   * @param End dernier indice a tester
   * @return l'index <= End, du dernier élément de cette séquence qui est égal (tel que déterminé par ==) à e, ou -1, s'il n'en existe pas.
   */
  def lastIndexOf(e:Int,End:Int):Int
  /**
   *
   * @param sousL sous-séquence
   * @return le premier index <= End, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def lastIndexOfSlice(sousL:ListInt):Int
  
  /**
   *
   * @param sousL sous-séquence
   * @param End dernier indice a tester
   * @return le premier index <= End, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def lastIndexOfSlice(sousL:ListInt,End:Int):Int
  
  /**
   *
   * @param f fonction a tester
   * @return l'indice du dernier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def lastIndexWhere(f:Int=>Boolean):Int
  
  /**
   *
   * @param f fonction a tester
   * @param End dernier indice a tester
   * @return l'indice <=End, du dernier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def lastIndexWhere(f:Int=>Boolean,End:Int):Int
  
  /**
   *
   * @return en option le dernier element ou None
   */
  def lastOption:Option[Int]
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus grands elements
   */
  def max(implicit ord:math.Ordering[Int]):Int
  
  /**
   *
   * @param f fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus grands elements
   */
  def maxBy(f:Int=>Int)(implicit ord:math.Ordering[Int]):Int
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus grands elements , None si la liste est vide
   */
  def maxOption(implicit ord:math.Ordering[Int]):Option[Int]
  
  /**
   *
   * @param f fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus grands elements , None si la liste est vide
   */
  def maxByOption(f:Int=>Int)(implicit ord:math.Ordering[Int]):Option[Int]
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus petit elements
   */
  def min(implicit ord:math.Ordering[Int]):Int
  
  /**
   *
   * @param f fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus petit elements
   */
  def minBy(f:Int=>Int)(implicit ord:math.Ordering[Int]):Int
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus petit elements , None si la liste est vide
   */
  def minOption(implicit ord:math.Ordering[Int]):Option[Int]
  
  /**
   *
   * @param f fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus petit elements , None si la liste est vide
   */
  def minByOption(f:Int=>Int)(implicit ord:math.Ordering[Int]):Option[Int]
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return Liste trié en fonction de ord
   */
  def sorted(implicit ord:math.Ordering[Int]):ListInt
  
  /**
   *
   * @param f fonction a applique a tous les element
   * @return liste apres application de f
   */
  def apply(f:Int=>Int):ListInt
  
  /**
   *
   * @param li liste a concatener trié
   * @return liste concatener de maniere croissante
   *         @note la 1ere liste a trier doit etre trié
   */
  def Concatenation(li:ListInt)(implicit ord: Ordering[Int]):ListInt
  
  override def hashCode(): Int = super.hashCode()
}

case object Nil extends ListInt {
  /**
   * @param Lis liste a concaténer
   * @return concaténation des 2 liste
   * @note La liste en argument est placer en seconde
   */
  def +(Lis: ListInt): ListInt = {
    Lis
  }
  /**
   * @return Si la liste est vide
   */
  def isEmpty: Boolean = true
  /**
   *
   * @return Nombre d'élément que contient la liste
   */
  def len(): Int = 0
  /**
   *
   * @return Represation de la liste sous forme de chaine de caractere
   *         @note E1, E2, ...,En
   */
  override def toString: String = "[]"
  /**
   *
   * @param List liste a comparer
   * @return Si les 2 liste sont égal
   */
  def equals(List: ListInt): Boolean = {
    List match {
      case Cons(_, _) => false
      case Nil        => true
    }
  }
  /**
   *
   * @param e Element a rechercher
   * @return Si l'element e est contenue dans la liste
   */
  def contain(e: Int): Boolean = false
  /**
   *
   * @return liste retourner
   */
  def reverse: ListInt = Nil
  /**
   *
   * @param f Fonction a applique a chacun des element de la liste
   * @tparam U Peut etre de n'importe quelle type
   */
  def foreach[U](f:Int => U ): Unit = {}
  /**
   *
   * @param id indice de l'element a recuperer
   * @return l'element a la place Id
   *         @note provoque une erreur du type : UnknownId
   *               Si l'indice n'hesiste pas
   */
  def get(id: Int): Int = throw new UnknownId
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return le reste de la liste sans les n permier
   */
  def drop(n: Int): ListInt = Nil
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return la liste sans les n dernier element
   */
  def dropRight(n: Int): ListInt = Nil
  
  /**
   *
   * @param f fonction utiliser pour verifer les element
   * @return la liste des element qui ne satisfont pas f
   */
  def dropWhile(f: Int => Boolean): ListInt = Nil
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return liste des n premier element
   */
  def take(n: Int): ListInt = Nil
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return liste des element qui ce situe apres les n premiere element
   */
  def takeRight(n: Int): ListInt = Nil
  
  /**
   *
   * @param f fonction utiliser pour verifer les element
   * @return la liste des element qui satisfont f
   */
  def takeWhile(f: Int => Boolean): ListInt = Nil
  
  /**
   *
   * @param from  le permier indice a inclure dans la liste
   * @param until le premier indice a exclure dans la liste
   * @return liste de from a until non inclus
   */
  def slice(from: Int, until: Int): ListInt = throw new UnknownId
  
  /**
   *
   * @param n entier a ajouter
   * @return liste avec l'element n en plus
   */
  def add(n: Int): ListInt = Cons(n,Nil)
  
  /**
   *
   * @param f le prédicat utilisé pour tester les éléments.
   * @return le nombre d'éléments satisfaisant le prédicat f
   */
  def count(f: Int => Boolean): Int = 0
  
  /**
   *
   * @return une nouvelle séquence Constituée de tous les éléments de cette séquence sans doublons
   */
  def distinct: ListInt = Nil
  
  /**
   *
   * @param f Fonction de transformation
   * @return une nouvelle séquence Constituée de tous les éléments de cette séquence après application de la fonction de transformation f sans doublons
   */
  def distinctBy(f: Int => Int): ListInt = Nil
  
  /**
   *
   * @param f fonction a tester
   * @return une nouvelle séquence Constituée de tous les éléments qui satifont f
   */
  def filter(f: Int => Boolean): ListInt = Nil
  
  /**
   *
   * @param f fonction a tester
   * @return une nouvelle séquence Constituée de tous les éléments qui ne satifont pas f
   */
  def filterNot(f: Int => Boolean): ListInt = Nil
  
  /**
   *
   * @param f fonction a tester
   * @return une valeur en option contenant le premier élément de la liste qui satisfait p, ou None s'il n'en existe pas.
   */
  def find(f: Int => Boolean): Option[Int] = None
  
  /**
   *
   * @param f fonction a tester
   * @return une valeur en option contenant le dernier élément de la liste qui satisfait p, ou None s'il n'en existe pas.
   */
  def findLast(f: Int => Boolean): Option[Int] = None
  
  /**
   *
   * @param f fonction a tester
   * @return Si tous les element de la liste verifie f
   */
  def forAll(f: Int => Boolean): Boolean = false
  
  /**
   *
   * @return en option le premiere element ou None
   */
  def headOption: Option[Int] = None
  
  /**
   *
   * @param e element a trouver
   * @return l'index >= 0 du premier élément de cette séquence qui est égal (tel que déterminé par ==) à e, ou -1, s'il n'en existe pas.
   */
  def indexOf(e: Int): Int = -1
  
  /**
   * @param e  element a trouver
   * @param Id premier indice a tester
   * @return l'index >= Id, du premier élément de cette séquence qui est égal (tel que déterminé par ==) à e, ou -1, s'il n'en existe pas.
   */
  def indexOf(e: Int, Id: Int): Int = -1
  
  /**
   *
   * @param sousL sous-séquence
   * @return le premier index >=0, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def indexOfSlice(sousL: ListInt): Int = -1
  
  /**
   *
   * @param sousL sous-séquence
   * @param Id    premier indice a tester
   * @return le premier index >= Id, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def indexOfSlice(sousL: ListInt, Id: Int): Int = -1
  
  /**
   *
   * @param f fonction a tester
   * @return l'indice >=0, du premier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def indexWhere(f: Int => Boolean): Int = -1
  
  /**
   *
   * @param f  fonction a tester
   * @param Id premier indice a tester
   * @return l'indice >=0, du premier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def indexWhere(f: Int => Boolean, Id: Int): Int = -1
  
  /**
   *
   * @return Le dernier élément de cette liste -1 si vide
   */
  def last: Int = -1
  
  /**
   * @param e  element a trouver
   * @param End dernier indice a tester
   * @return l'index <= End, du dernier élément de cette séquence qui est égal (tel que déterminé par ==) à e, ou -1, s'il n'en existe pas.
   */
  def lastIndexOf(e: Int, End: Int): Int = -1
  
  /**
   *
   * @param sousL sous-séquence
   * @return le premier index <= End, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def lastIndexOfSlice(sousL: ListInt): Int = -1
  
  /**
   *
   * @param sousL sous-séquence
   * @param End   dernier indice a tester
   * @return le premier index <= End, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def lastIndexOfSlice(sousL: ListInt, End: Int): Int = -1
  
  /**
   *
   * @param f fonction a tester
   * @return l'indice du dernier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def lastIndexWhere(f: Int => Boolean): Int = -1
  
  /**
   *
   * @param f   fonction a tester
   * @param End dernier indice a tester
   * @return l'indice <=End, du dernier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def lastIndexWhere(f: Int => Boolean, End: Int): Int = -1
  
  /**
   *
   * @return en option le dernier element ou None
   */
  def lastOption: Option[Int] = None
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus grands elements
   */
  def max(implicit ord: Ordering[Int]): Int = throw new ListVide
  
  /**
   *
   * @param f   fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus grands elements
   */
  def maxBy(f: Int => Int)(implicit ord: Ordering[Int]): Int = throw new ListVide
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus grands elements , None si la liste est vide
   */
  def maxOption(implicit ord: Ordering[Int]): Option[Int] = None
  
  /**
   *
   * @param f   fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus grands elements , None si la liste est vide
   */
  def maxByOption(f: Int => Int)(implicit ord: Ordering[Int]): Option[Int] = None
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus petit elements
   */
  def min(implicit ord: Ordering[Int]): Int = throw new ListVide
  
  /**
   *
   * @param f   fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus petit elements
   */
  def minBy(f: Int => Int)(implicit ord: Ordering[Int]): Int = throw new ListVide
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus petit elements , None si la liste est vide
   */
  def minOption(implicit ord: Ordering[Int]): Option[Int] = None
  
  /**
   *
   * @param f   fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus petit elements , None si la liste est vide
   */
  def minByOption(f: Int => Int)(implicit ord: Ordering[Int]): Option[Int] = None
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return Liste trié en fonction de ord
   */
  def sorted(implicit ord: Ordering[Int]): ListInt = Nil
  
  def apply(f: Int => Int): ListInt = Nil
  
  /**
   *
   * @param li liste a concatener trié
   * @return liste concatener de maniere croissante
   * @note la 1ere liste a trier doit etre trié
   */
  def Concatenation(li: ListInt)(implicit ord: Ordering[Int]): ListInt = li
}

/**
 * @param head 1 element
 * @param tail suite de la liste
 */
case class Cons(head: Int, tail: ListInt) extends ListInt {
  /**
   * @param Lis liste a concaténer
   * @return concaténation des 2 liste
   * @note La liste en argument est placer en seconde
   */
  def +(Lis: ListInt): ListInt = {
    this match {
      case Cons(z, zs) => Cons(z, zs + Lis)
    }
  }
  /**
   * @return Si la liste est vide
   */
  def isEmpty: Boolean = false
  /**
   *
   * @return Nombre d'élément que contient la liste
   */
  def len(): Int = {
    1 + this.tail.len()
  }
  /**
   *
   * @return Represation de la liste sous forme de chaine de caractere
   *         @note E1, E2, ...,En
   */
  override def toString: String = {
    var ret ="["
    for(i <- 0 to this.len()-2){
      ret+=this.get(i)+" ,"
    }
    ret+this.get(this.len()-1)+"]"
  }
  /**
   *
   * @param List liste a comparer
   * @return Si les 2 liste sont égal
   */
  def equals(List: ListInt): Boolean = {
    List match {
      case Nil         => false
      case Cons(z, zs) => z == this.head && this.tail.equals(zs)
      
    }
  }
  /**
   *
   * @param e Element a rechercher
   * @return Si l'element e est contenue dans la liste
   */
  def contain(e: Int): Boolean = {
    if (this.head == e) true else this.tail.contain(e)
    
  }
  /**
   *
   * @return liste retourner
   */
  def reverse: ListInt = {
    var ret =Cons(this.head,Nil)
    for(i <- 1 until this.len()){
      ret=Cons(this.get(i),ret)
    }
    ret
  }
  /**
   *
   * @param f Fonction a applique a chacun des element de la liste
   * @tparam U Peut etre de n'importe quelle type
   */
  def foreach[U](f:Int => U ): Unit = {
    f(this.head)
    this.tail.foreach(f)
  }
  /**
   *
   * @param id indice de l'element a recuperer
   * @return l'element a la place Id
   *         @note provoque une erreur du type : UnknownId
   *               Si l'indice n'hesiste pas
   */
  def get(id: Int): Int = {
    if(id<0) throw new UnknownId
    id match {
      case 0 => this.head
      case _ => this.tail.get(id-1)
    }
  }
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return le reste de la liste sans les n permier
   */
  def drop(n: Int): ListInt = {
    if( n < 0 )
      this
    else
      if(n>this.len())
        Nil
      else
        n match{
        case 0 => this
        case _ => this.tail.drop(n-1)
      }
  }
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return la liste sans les n dernier element
   */
  def dropRight(n: Int): ListInt = this.take(this.len()-n)
  
  /**
   *
   * @param f fonction utiliser pour verifer les element
   * @return le suffixe le plus long de cette séquence dont le premier élément ne satisfait pas le prédicat f
   */
  def dropWhile(f: Int => Boolean): ListInt = {
    if (f(this.head)) {
      this.tail.dropWhile(f)
    } else {
      this
    }
  }
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return liste des n premier element
   *         @note n>0
   */
  def take(n: Int): ListInt = {
    if(n<1)
        Nil
    else
      if (n>this.len())
        this
    else{
      var ret = Cons(this.get(n-1),Nil)
      for(i <- (0 until  n-1 ).reverse){
        ret=Cons(this.get(i),ret)
      }
    ret
    }
  }
  
  /**
   *
   * @param n indice d'un element de la liste
   * @return liste des element qui ce situe apres les n premier element
   */
  def takeRight(n: Int): ListInt = this.drop(this.len()-n)
  
  /**
   *
   * @param f fonction utiliser pour verifer les element
   * @return le plus long préfixe de cette liste dont les éléments satisfont tous au prédicat f.
   */
  def takeWhile(f: Int => Boolean): ListInt = {
    var b :ListInt= Nil
    var i :Int= 0
    while (i<this.len() && f(this.get(i))) {
      b = b.add(this.get(i))
      i+=1
    }
    b.reverse
  }
  
  /**
   *
   * @param from  le permier indice a inclure dans la liste
   * @param until le premier indice a exclure dans la liste
   * @return liste de from a until non inclus
   */
  def slice(from: Int, until: Int): ListInt = {
    var deb:Int = from
    if(from<0)
    deb =0
  this.drop(deb).take(until-deb)
  }
  /**
   *
   * @param n entier a ajouter
   * @return liste avec l'element n en plus
   */
  def add(n: Int): ListInt = Cons(n,this)
  
  /**
   *
   * @param f le prédicat utilisé pour tester les éléments.
   * @return le nombre d'éléments satisfaisant le prédicat f (tel que déterminé par ==)
   */
  def count(f: Int => Boolean): Int = {
    var rep :Int =0
    for(i<-0 until this.len()){
      if(f(this.get(i)))rep+=1
    }
    rep
  }
  
  /**
   *
   * @return une nouvelle séquence Constituée de tous les éléments de cette séquence sans doublons
   *         @note retire toujours le plus grand indice
   *               [1,2,3,4,1,2,5] -> [1,2,3,4,5]
   */
  def distinct: ListInt = {
    var rep: ListInt = Nil
    for(i <- 0 until this.len()){
      if(!rep.contain(this.get(i))) {
        rep=rep.add(this.get(i))
      }
    }
    rep.reverse
  }
  
  /**
   *
   * @param f Fonction de transformation
   * @return une nouvelle séquence Constituée de tous les éléments de cette séquence après application de la fonction de transformation f sans doublons
   */
  def distinctBy(f: Int => Int): ListInt = this.apply(f).distinct
  
  /**
   *
   * @param f fonction a tester
   * @return une nouvelle séquence Constituée de tous les éléments qui satifont f
   */
  def filter(f: Int => Boolean): ListInt = {
    var rep: ListInt = Nil
    for(i <- 0 until this.len()){
      if(f(this.get(i))) {
        rep=rep.add(this.get(i))
      }
    }
    rep.reverse
  }
  
  /**
   *
   * @param f fonction a tester
   * @return une nouvelle séquence Constituée de tous les éléments qui ne satifont pas f
   */
  def filterNot(f: Int => Boolean): ListInt = {
    var rep: ListInt = Nil
    for(i <- 0 until this.len()){
      if(!f(this.get(i))) {
        rep=rep.add(this.get(i))
      }
    }
    rep.reverse
  }
  
  /**
   *
   * @param f fonction a tester
   * @return une valeur en option contenant le premier élément de la liste qui satisfait p, ou None s'il n'en existe pas.
   */
  def find(f: Int => Boolean): Option[Int] = {
    for(i <- 0 until this.len()){
      if(f(this.get(i))) {
        Some(this.get(i))
      }
    }
    None
  }
  
  /**
   *
   * @param f fonction a tester
   * @return une valeur en option contenant le dernier élément de la liste qui satisfait p, ou None s'il n'en existe pas.
   */
  def findLast(f: Int => Boolean): Option[Int] = {
    for(i <- 1 to this.len()){
      if(f(this.get(this.len()-i))) {
        Some(this.get(this.len()-i-1))
      }
    }
    None
  }
  
  /**
   *
   * @param f fonction a tester
   * @return Si tous les element de la liste verifie f
   */
  def forAll(f: Int => Boolean): Boolean ={
    var rep:Boolean = true
    for(i <- 0 until this.len()){
      if (!f(this.get(i))) rep= false
    }
    rep
  }
  
  
  /**
   *
   * @return en option le premiere element ou None
   */
  def headOption: Option[Int] = Some(this.head)
  
  /**
   *
   * @param e element a trouver
   * @return l'index >= 0 du premier élément de cette séquence qui est égal (tel que déterminé par ==) à e, ou -1, s'il n'en existe pas.
   */
  def indexOf(e: Int): Int = {
    var rep:Int = -1
    var i: Int = 0
    while(i < this.len()&& !(i == -1)) {
      if (e == this.get(i)) {
        rep = i
      }
      i = i+1
    }
    rep
  }
  
  /**
   * @param e  element a trouver
   * @param Id premier indice a tester
   * @return l'index >= Id, du premier élément de cette séquence qui est égal (tel que déterminé par ==) à e, ou -1, s'il n'en existe pas.
   */
  def indexOf(e: Int, Id: Int): Int = {
    var rep:Int = -1
    var i: Int = Id
    while(i < this.len()&& !(i == -1)) {
      if (e == this.get(i)) {
        rep = i
      }
      i = i+1
    }
    rep
  }
  
  /**
   *
   * @param sousL sous-séquence
   * @return le premier index >=0, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def indexOfSlice(sousL: ListInt): Int = {
    var ret :Int = -1
    if(sousL.len()==0)ret = 0
    else if(sousL.len()<=this.len()) {
      var i: Int = 0
      while (i < this.len() - sousL.len() && !(0 to this.len() contains ret)) {
        var j: Int = 0
        while (j < sousL.len() && sousL.get(j) == this.get(i + j)) {
          j = j + 1
        }
        if (j == sousL.len())
          ret = i
        else i = i + 1
      }
    }
    ret
  }
  /**
   *
   * @param sousL sous-séquence
   * @param Id    premier indice a tester
   * @return le premier index >= Id, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def indexOfSlice(sousL: ListInt, Id: Int): Int = {
    var ret :Int = -1
    if(sousL.len()==0)ret = 0
    else if(sousL.len()<=this.len()-Id) {
      var i: Int = Id
      while (i < this.len() - sousL.len() && !(0 to this.len() contains ret)) {
        var j: Int = 0
        while (j < sousL.len() && sousL.get(j) == this.get(i + j)) {
          j = j + 1
        }
        if (j == sousL.len())
          ret = i
        else i = i + 1
      }
    }
    ret
  }
  
  /**
   *
   * @param f fonction a tester
   * @return l'indice >=0, du premier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def indexWhere(f: Int => Boolean): Int = {
    var rep:Int = -1
    var i: Int = 0
    while(i < this.len()&& !(i == -1)) {
      if (f(this.get(i))) {
        rep = i
      }
      i = i+1
    }
    rep
  }
  
  /**
   *
   * @param f  fonction a tester
   * @param Id premier indice a tester
   * @return l'indice >=0, du premier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def indexWhere(f: Int => Boolean, Id: Int): Int = {
    var rep:Int = -1
    var i: Int = Id
    while(i < this.len()&& !(i == -1)) {
      if (f(this.get(i))) {
        rep = i
      }
      i = i+1
    }
    rep
  }
  
  /**
   *
   * @return Le dernier élément de cette liste -1 si vide
   */
  def last: Int = {
    this match{
      case Cons(a,Nil) => a
      case Cons(_,zs) => zs.last
    }
  }
  
  /**
   * @param e  element a trouver
   * @param End dernier indice a tester
   * @return l'index <= End, du dernier élément de cette séquence qui est égal (tel que déterminé par ==) à e, ou -1, s'il n'en existe pas.
   */
  def lastIndexOf(e: Int, End: Int): Int = {
    val these = this.dropRight(End)
    these.reverse.indexOf(e) match {
      case -1 => -1
      case  a => these.len()-a-1
    }
  }
  
  /**
   *
   * @param sousL sous-séquence
   * @return le premier index <= End, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def lastIndexOfSlice(sousL: ListInt): Int = {
    var ret :Int = -1
    if(sousL.len()==0)ret = 0
    else if(sousL.len()<=this.len()) {
      var i: Int = 0
      while (i < this.len() - sousL.len()) {
        var j: Int = 0
        while (j < sousL.len() && sousL.get(j) == this.get(i + j)) {
          j = j + 1
        }
        if (j == sousL.len())
          ret = i
        else i = i + 1
      }
    }
    ret
  }
  
  /**
   *
   * @param sousL sous-séquence
   * @param End   dernier indice a tester
   * @return le premier index <= End, de tel que les éléments de cette séquence commençant à cet index correspondent aux éléments de sousL (tel que déterminé par ==) , ou -1 si aucune sous-séquence n'existe.
   */
  def lastIndexOfSlice(sousL: ListInt, End: Int): Int = {
    val these=this.dropRight(End)
    these.lastIndexOfSlice(sousL)
  }
  
  /**
   *
   * @param f fonction a tester
   * @return l'indice du dernier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def lastIndexWhere(f: Int => Boolean): Int = {
    var rep:Int = -1
    var i: Int = 0
    while(i < this.len()) {
      if (f(this.get(i))) {
        rep = i
      }
      i = i+1
    }
    rep
  }
  
  /**
   *
   * @param f   fonction a tester
   * @param End dernier indice a tester
   * @return l'indice <=End, du dernier élément de cette séquence qui satisfait le prédicat f, ou -1, s'il n'en existe pas.
   */
  def lastIndexWhere(f: Int => Boolean, End: Int): Int = {
    val these=this.dropRight(End)
    these.lastIndexWhere(f)
  }
  
  /**
   *
   * @return en option le dernier element ou None
   */
  def lastOption: Option[Int] = this.reverse.headOption
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus grands elements
   */
  def max(implicit ord: Ordering[Int]): Int = {
    var maxVal: Int =this.head
    for(i<-this){
      if(ord.gt(i,maxVal)){
        maxVal=i
      }
    }
    maxVal
  }
  
  /**
   *
   * @param f   fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus grands elements
   */
  def maxBy(f: Int => Int)(implicit ord: Ordering[Int]): Int = this.apply(f).max(ord)
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus grands elements , None si la liste est vide
   */
  def maxOption(implicit ord: Ordering[Int]): Option[Int] = Some(this.max(ord))
  
  /**
   *
   * @param f   fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus grands elements , None si la liste est vide
   */
  def maxByOption(f: Int => Int)(implicit ord: Ordering[Int]): Option[Int] = Some(this.apply(f).max(ord))
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus petit elements
   */
  def min(implicit ord: Ordering[Int]): Int = {
    var minVal: Int =this.head
    for(i<-this){
      if(ord.lt(i,minVal)){
        minVal=i
      }
    }
    minVal
  }
  
  /**
   *
   * @param f   fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return le plus petit elements
   */
  def minBy(f: Int => Int)(implicit ord: Ordering[Int]): Int = this.apply(f).min(ord)
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus petit elements , None si la liste est vide
   */
  def minOption(implicit ord: Ordering[Int]): Option[Int] = Some(this.min(ord))
  
  /**
   *
   * @param f   fonction a applique a tous les elements
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return en option le plus petit elements , None si la liste est vide
   */
  def minByOption(f: Int => Int)(implicit ord: Ordering[Int]): Option[Int] = Some(this.apply(f).min(ord))
  
  /**
   *
   * @param ord ordre utiliser pour comparer les elements (implicit)
   * @return Liste trié en fonction de ord
   */
  def sorted(implicit ord: Ordering[Int]): ListInt = ???
  
  /**
   *
   * @param f fonction a applique a tous les element
   * @return liste apres application de f
   */
  def apply(f:Int=>Int):ListInt={
    var rep:ListInt=Nil
    for(i <- 0 until this.len()){
      rep=rep.add(f(this.get(i)))
    }
    rep.reverse
  }
  
  /**
   *
   * @param li liste a concatener trié
   * @return liste concatener de maniere croissante
   * @note la 1ere liste a trier doit etre trié
   */
  def Concatenation(li: ListInt)(implicit ord: Ordering[Int]): ListInt = ???
}

object Test extends App {
  val L =  Cons(8, Cons(3, Cons(6,Cons(4,Cons(5,Cons(6,Cons(1,Nil)))))))
  println(L.lastIndexOf(6,2))
  val a = List(1,2,3,4,5,6)
  println(a.max)
}
// https://www.scala-lang.org/api/2.13.3/scala/collection/immutable/List.html
// scala doc list
