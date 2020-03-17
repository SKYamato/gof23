package co.zs._13visitor.asm;

import lombok.SneakyThrows;
import org.objectweb.asm.*;

import static org.objectweb.asm.Opcodes.ASM4;

/**
 * ASM操作字节码文件
 * https://asm.ow2.io/asm4-guide.pdf
 * 2.2.2. Parsing classes
 *
 * @author shuai
 * @date 2020/03/17 13:45
 */
public class ClassPrinter extends ClassVisitor {
    public ClassPrinter() {
        super(ASM4);
    }

    public void visit(int version, int access, String name,
                      String signature, String superName, String[] interfaces) {
        System.out.println(name + " extends " + superName + " {");
    }

    public void visitSource(String source, String debug) {
    }

    public void visitOuterClass(String owner, String name, String desc) {
    }

    public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        return null;
    }

    public void visitAttribute(Attribute attr) {
    }

    public void visitInnerClass(String name, String outerName, String innerName, int access) {
    }

    public FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        System.out.println(" " + desc + " " + name);
        return null;
    }

    public MethodVisitor visitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        System.out.println(" " + name + desc);
        return null;
    }

    public void visitEnd() {
        System.out.println("}");
    }

    @SneakyThrows
    public static void main(String[] args) {
        ClassPrinter cp = new ClassPrinter();
        ClassReader cr = new ClassReader(ClassPrinter.class.getClassLoader().getResourceAsStream("co/zs/_13visitor/asm/ClassPrinter.class"));
        cr.accept(cp, 0);
    }
}
