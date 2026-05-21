package com.practice.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Practice: {@code Externalizable} — custom {@code writeExternal} / {@code readExternal}.
 */
public class ExternalizableDemo {

    public static void main(String[] args) {
        // Your code here
    }

    public static class Config implements Externalizable {
        private String key;
        private String value;

        public Config() {
            // required public no-arg for Externalizable
        }

        public Config(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeUTF(key);
            out.writeUTF(value);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            key = in.readUTF();
            value = in.readUTF();
        }
    }
}
