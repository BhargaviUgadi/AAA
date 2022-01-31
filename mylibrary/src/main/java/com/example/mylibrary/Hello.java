package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Hello {
    public static int main(int a, int b, Context context) {
        int sum=a+b;
        Toast.makeText(context ,sum, Toast.LENGTH_SHORT).show();
        return sum;
    }
}
