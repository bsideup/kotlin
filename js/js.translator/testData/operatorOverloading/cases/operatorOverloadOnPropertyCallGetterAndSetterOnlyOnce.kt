package foo

class MyInt(i: Int) {
    var b = i
    operator fun inc(): MyInt {
        b = b + 1;
        return this;
    }
}

class A() {

    var gc = 0
    var sc = 0


    var b = MyInt(0)
        get() {
            gc = gc + 1;
            return field;
        }
        set(a: MyInt) {
            sc = sc + 1;
        }
}


fun box(): Boolean {
    val t = A()
    val d = t.b++;
    return (t.sc == 1) && (t.gc == 1);
}