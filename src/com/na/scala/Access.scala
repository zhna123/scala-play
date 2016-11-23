/**
  * Created by nz026920 on 8/25/16.
  */
class Access {

  // about private members
  // java allows outter class visit inner class' private members, but scala doesn't allow it.

  // protect members
  // only allow sub-class visit super-class
  // Java allows same package visit as well, but not scala

  // public members don't need to specify public modifiers

  // one special thing is the access modifiers can be augmented with qualifiers
  // A modifier of the form private[X] or protected[X] means that access is private or protected "up to" X,
  // where X designates some enclosing package, class or singleton object.

}
