package main.flyweightpattern;

import main.facedemode.FaceInterface;

import java.util.HashMap;

/**
 * Created by Administrator on 2019/7/24.
 */
public class ModeFactory {

    public static final HashMap<String, FaceInterface> maps = new HashMap<>();

    public static SameMode getSame(String name) {
        SameMode mode = (SameMode)maps.get(name);
        if (mode == null) {
            mode = new SameMode(name);
            maps.put(name, mode);
            System.out.println("create mode food" + name);
        }
        return mode;
    }
}
