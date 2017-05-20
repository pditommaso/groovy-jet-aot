/* 
 * 
 */
@groovy.transform.CompileStatic
class Hello {

  private Map<String,Integer> values = [:]

  void run(String... args) { 
       if(!args) 
         args = 'Just hello!'.tokenize()
       
       args.each { String it -> values[it] = it.size() }
       
       values.each { k, v -> 
          println "word: $k, length: $v"
       }
  }

  /* 
   * entry method 
   */
  static void main(String... args) {
    new Hello().run(args)
  } 

}