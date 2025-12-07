package com.burakc;

public class _3_WrapperTypes {
    /*
    Commoun Rules:
    üğişçö, İÜĞŞÇÖ yazma

    değişkenler:
     sayı ile başlanmaz
     _ veya & ile başlanır


    Primitive stack memory kullanıır ,daha hızlıdır Heap memeory'e göre
    *
    *  */

    // psvm TAB
    static void main() {
        // Primitve Types
        // Tamsayılar
        Byte wrapperByte = 127;
        Short wrapperShort = 140;
        Integer wrapperInt = 140;
        Long wrapperLong = 122112121L;

        // Floating point
        Float wrapperFloat = 14.53f;
        Double wrapperDouble = 141414.5353535353;

        // other
        Boolean wrapperBoolean = true;
        Character wrapperChar = '@';
        wrapperChar = '&';
        //wrapperChar = 'ᑒ';
        wrapperChar = '\u1452';
        System.out.println(wrapperChar);
    } //end psvm
} // class _2_DataTypes
