package com.shc.javauwp;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;

public class Main implements EntryPoint
{
    @Override
    public void onModuleLoad()
    {
        Document.get()
                .getElementById("hello")
                .setInnerHTML("Howdy!!!");
    }
}
