fun main(args: Array<String>) {

    val arrA = intArrayOf(1,232,435,6,21,6)

    val listA: ArrayList<String> = arrayListOf<String>("hola", "Kotlin", "Java")

    val num = arrA.get(0)
    arrA.set(2, 10)

    val mutableList = mutableListOf<Int>(2,3,4,5,6,7)
    mutableList.add(9)
    mutableList.add(2,10)
    mutableList.set(0,1)

    val map = mutableMapOf<String,Int>(Pair("key", 30))
    map.put("key2",40)


}