package com.interview.factset;

import java.io.BufferedWriter;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class WithOutSytem {
	  public static void main(String args[]) throws IOException {
	    BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new
	      FileOutputStream(FileDescriptor.out), "ASCII"), 512);
	    out.write("test string");
	    out.write('\n');
	    out.flush();
	  }
	}
