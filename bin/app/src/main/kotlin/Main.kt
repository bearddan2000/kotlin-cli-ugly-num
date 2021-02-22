import kotlin.rem

/*This function divides a by greatest
divisible power of b*/
fun maxDivide(a:Int, b:Int): Int
{
    var c = a
    while(c.rem(b).toInt() == 0) { c = (c/b).toInt()}
		return c
}

/* Function to check if a number
is ugly or not */
fun isUgly(no:Int): Boolean
{
	 val x = maxDivide(no, 2);
	 val y = maxDivide(x, 3);
	 val z = maxDivide(y, 5);

	 return (z == 1)
}

/* Function to get the nth ugly
number*/
fun getNthUglyNo(n:Int)
{
	 var i = 1

	 // ugly number count
	 var count = 1

	 // check for all integers
	 // until count becomes n
	 while(n > count)
	 {
			 i++
			 if(isUgly(i)) {count++}
	 }
	 println("[OUTPUT] " + i)
}

fun main() {
  val N: Int = 10
  println("[INPUT] " + N)
  getNthUglyNo(N)
}
