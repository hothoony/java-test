
import java.util.Iterator;
import java.util.Properties;

public class Test_System_getProperty {
    
    public static void main(String[] args) {

        System.out.println();
        System.out.println(">> main begin");
        System.out.println();

        testCode();

        System.out.println();
        System.out.println(">> main end");
        System.out.println();
    }

    private static void testCode() {

        Properties properties = System.getProperties();
        Iterator<Object> iter = properties.keySet().iterator();
        while (iter.hasNext()) {
            String key = (String) iter.next();
            System.out.println(key + " => " + System.getProperty(key));
        }
    }
}

// jdk.module.main.class => com.sun.tools.javac.launcher.Main
// sun.management.compiler => HotSpot 64-Bit Tiered Compilers
// ftp.nonProxyHosts => local|*.local|169.254/16|*.169.254/16|127.0.0.1:16105|*.127.0.0.1:16105|lx.astxsvc.com|*.lx.astxsvc.com
// java.runtime.version => 17.0.12+0
// user.name => hothoony
// jdk.launcher.sourcefile => /Volumes/mydata/personal/github/java-test/_code-snippet-test/Test_System_getProperty.java
// path.separator => :
// os.version => 15.0.1
// java.runtime.name => OpenJDK Runtime Environment
// file.encoding => UTF-8
// java.vm.name => OpenJDK 64-Bit Server VM
// java.vendor.version => Homebrew
// java.vendor.url.bug => https://github.com/Homebrew/homebrew-core/issues
// java.io.tmpdir => /var/folders/g4/q47yptzx19125h67g5g2dyjr0000gn/T/
// java.version => 17.0.12
// user.dir => /Volumes/mydata/personal/github/java-test/_code-snippet-test
// os.arch => aarch64
// java.vm.specification.name => Java Virtual Machine Specification
// native.encoding => UTF-8
// java.library.path => /Users/hothoony/Library/Java/Extensions:/Library/Java/Extensions:/Network/Library/Java/Extensions:/System/Library/Java/Extensions:/usr/lib/java:.
// java.vm.info => mixed mode, sharing
// java.vendor => Homebrew
// java.vm.version => 17.0.12+0
// sun.io.unicode.encoding => UnicodeBig
// socksNonProxyHosts => local|*.local|169.254/16|*.169.254/16|127.0.0.1:16105|*.127.0.0.1:16105|lx.astxsvc.com|*.lx.astxsvc.com
// java.class.version => 61.0
