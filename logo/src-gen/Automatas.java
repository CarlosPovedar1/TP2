// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Automatas.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Automatas {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=4;
      Object Estados=$fix(GCollections.asSet("q0","q1","q2"));
      $line=5;
      Object Alfabeto=$fix(GCollections.asSet('0','1','2'));
      $line=6;
      Object inicial=$fix("q0");
      $line=7;
      Object Finales=$fix(GCollections.asSet("q0"));
      $line=9;
      Object M=$fix($invokeConstructor(GDeterministicAutomaton.class,new Object[]{Estados,Alfabeto,inicial,Finales,new GMethod(Automatas.class,"transiciones")}));
      $line=11;
      GAutomataFrame.show($cast(gold.structures.automaton.IAutomaton.class,M));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Automatas.class,"main",$line);
    }
  }
  public static Object transiciones(Object estado, Object simbolo) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=15;
      if ($opEqualY(simbolo,'0')) {
        $line=16;
        $result=estado;
        if (true) break $try;
      }
      else {
        $line=17;
        if ($opEqualY(simbolo,'1')) {
          $line=18;
          if ($bool(estado.equals("q0"))) {
            $line=19;
            $result="q1";
            if (true) break $try;
          }
          else {
            $line=20;
            if ($bool(estado.equals("q1"))) {
              $line=21;
              $result="q2";
              if (true) break $try;
            }
            else {
              $line=23;
              $result="q0";
              if (true) break $try;
            }
          }
        }
        else {
          $line=28;
          if ($bool(estado.equals("q0"))) {
            $line=29;
            $result="q2";
            if (true) break $try;
          }
          else {
            $line=30;
            if ($bool(estado.equals("q1"))) {
              $line=31;
              $result="q0";
              if (true) break $try;
            }
            else {
              $line=33;
              $result="q1";
              if (true) break $try;
            }
          }
        }
      }
      $line=38;
      $rethrow(new RuntimeException("The function \"transiciones(estado:Object,simbolo:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Automatas.class,"transiciones",$line);
    }
    return $result;
  }
}
