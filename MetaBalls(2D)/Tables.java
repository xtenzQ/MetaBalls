package org.yourorghere;

public class Tables {

    static int[] edgeTable = {
        0x0, 0x9, 0x3, 0xA, 0x6, 0xF, 0x5, 0xC,
        0xC, 0x5, 0xF, 0x6, 0xA, 0x3, 0x9, 0x0};

    static int[][] lineTable = {
        {-1, -1, -1, -1},
        {3, 0, -1, -1, -1, -1},
        {0, 1, -1, -1, -1, -1},
        {1, 3, -1, -1, -1, -1},
        {1, 2, -1, -1, -1, -1},
        {1, 2, 3, 0, -1, -1},
        {0, 2, -1, -1, -1, -1},
        {2, 3, -1, -1, -1, -1},
        {2, 3, -1, -1, -1, -1},
        {0, 2, -1, -1, -1, -1},
        {0, 1, 2, 3, -1, -1},
        {1, 2, -1, -1, -1, -1},
        {1, 3, -1, -1, -1, -1},
        {0, 1, -1, -1, -1, -1},
        {3, 0, -1, -1, -1, -1},
        {-1, -1, -1, -1, -1, -1}};
}