package com.luomo.tij.chapter11;

import java.util.*;

import static com.luomo.tij.util.Print.print;

/**
 * @author LiuMei
 * @date 2018-09-21.
 */
public class AsListInference {

    static class Snow {
    }

    static class Powder extends Snow {
    }

    static class Light extends Powder {
    }

    static class Heavy extends Powder {
    }

    static class Crusty extends Snow {
    }

    static class Slush extends Snow {
    }

    public static void main(String[] args) {
        List<Snow> snows = Arrays.asList(new Crusty(), new Slush(), new Powder());
        List<Snow> powders = Arrays.asList(new Light(), new Heavy());
        List<Snow> snows1 = new ArrayList<>();
        Collections.addAll(snows1, new Light(), new Heavy());
        List<Snow> snows2 = Arrays.asList(new Light(), new Heavy());
        Iterator<Snow> iterator = snows1.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
            print(snows1.size());
        }
    }

}
