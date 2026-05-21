# Java Practice Programs

Core Java practice organized by topic. One class per exercise; commit as you complete programs.

## Why Maven (not Gradle)?

- **Maven** fits this repo: one `pom.xml`, standard `src/main/java` layout, easy in any IDE.
- **Gradle** is better for large multi-module apps; you can migrate later if needed.

**JDK:** 17 (LTS). Install with `java -version` and set `JAVA_HOME` if needed.

## Quick start

```bash
cd java-practice-programs
mvn compile
mvn test
```

Run a specific class (replace with your class):

```bash
mvn -q exec:java -Dexec.mainClass="com.practice.basic.oops.InheritanceDemo"
```

Or run `main` from your IDE (IntelliJ / VS Code Java extension).

## Package layout

```
src/main/java/com/practice/
├── basic/           OOP, compile-time vs runtime, keywords
├── string/          String, StringBuilder, StringBuffer
├── reflection/      Class, fields, methods, annotations
├── serialization/   Serializable, Externalizable, transient
├── threads/         Thread, Runnable, sync, pools, concurrency
├── java7/           try-with-resources, diamond, NIO Path, fork/join intro
├── java8/           lambda, functional interfaces, streams, Optional, java.time
└── collections/     List, Map, Set, Deque, Stack, sorting, iterators

practice-programs/   Interview coding templates (requirements only — you implement)
├── Fibonacci.java, IsPrime.java, OddEven.java, ...
└── README.md
```

## Suggested programs by topic

### `basic` — OOP & fundamentals

| File (create) | Practice |
|---------------|----------|
| `oops/InheritanceDemo` | IS-A: `extends`, method overriding, `super` |
| `oops/PolymorphismDemo` | Upcasting, runtime dispatch, overload vs override |
| `oops/AbstractionDemo` | Abstract class + interface (default/static methods) |
| `oops/EncapsulationDemo` | Private fields, getters/setters, immutability |
| `compiletime/MethodOverloadingDemo` | Same name, different parameters |
| `compiletime/FinalStaticDemo` | `final` class/method/var; static blocks order |
| `runtime/MethodOverridingDemo` | `@Override`, covariant return |
| `runtime/InstanceOfDemo` | `instanceof`, pattern matching (Java 16+) |
| `keywords/EqualsHashCodeDemo` | Contract, `Objects.equals`, pitfalls |
| `keywords/CloneDemo` | Shallow vs deep copy |

### `string`

| Program | Idea |
|---------|------|
| `StringPoolDemo` | `==` vs `equals`, intern(), literals vs `new` |
| `StringBuilderBufferDemo` | Mutability, thread-safety, when to use which |
| `ReverseStringDemo` | Reverse without extra lib |
| `AnagramCheckDemo` | Sort or frequency count |
| `FirstNonRepeatingCharDemo` | LinkedHashMap or index scan |
| `SubstringPitfallsDemo` | Memory / substring behavior (know for interviews) |

### `reflection`

| Program | Idea |
|---------|------|
| `ClassObjectDemo` | `.class`, `getClass()`, `Class.forName` |
| `InspectFieldsDemo` | `getDeclaredFields`, set accessible |
| `InvokeMethodDemo` | `getMethod`, `invoke` |
| `AnnotationReaderDemo` | Read runtime annotations |

### `serialization`

| Program | Idea |
|---------|------|
| `SerializableDemo` | `ObjectOutputStream` / `ObjectInputStream`, `serialVersionUID` |
| `TransientDemo` | `transient` fields not serialized |
| `ExternalizableDemo` | `readExternal` / `writeExternal` custom format |
| `SingletonSerializationDemo` | Broken singleton + fix (`readResolve`) |

### `threads`

| Program | Idea |
|---------|------|
| `ThreadRunnableDemo` | Extend `Thread` vs implement `Runnable` |
| `SynchronizedDemo` | `synchronized` method/block, intrinsic lock |
| `WaitNotifyDemo` | Producer-consumer with `wait`/`notify` |
| `ExecutorServiceDemo` | `Executors.newFixedThreadPool`, `submit`, `Future` |
| `CallableFutureDemo` | `Callable` + `Future.get` |
| `DeadlockDemo` | Two locks — detect and fix ordering |
| `ThreadLocalDemo` | Per-thread context |
| `ConcurrentHashMapDemo` | vs `HashMap` under concurrency |
| `CountDownLatchDemo` | Coordinate N threads |
| `VolatileDemo` | Visibility (with caveats) |

### `java7`

| Program | Idea |
|---------|------|
| `TryWithResourcesDemo` | Auto-close `AutoCloseable` |
| `DiamondOperatorDemo` | `List<String> list = new ArrayList<>();` |
| `SwitchStringsDemo` | `switch` on `String` (Java 7) |
| `FilesNioDemo` | `Files.readAllLines`, `Paths.get` |
| `ForkJoinDemo` | `RecursiveTask` sum (intro) |

### `java8`

| Program | Idea |
|---------|------|
| `LambdaExpressionDemo` | `(a, b) -> ...` vs anonymous classes; Comparator lambda |
| `FunctionalInterfaceDemo` | Custom `@FunctionalInterface`; SAM; default methods on FI |
| `PredicateFunctionConsumerDemo` | `Predicate`, `Function`, `Consumer`, `Supplier` |
| `BiFunctionUnaryOperatorDemo` | `BiFunction`, `BinaryOperator`, `UnaryOperator`, `BiPredicate` |
| `MethodReferenceDemo` | `Class::method`, `instance::method`, constructor refs |
| `StreamBasicsDemo` | `filter`, `map`, `distinct`, `collect` |
| `StreamReduceCollectDemo` | `reduce`, `max`/`min`, `findFirst`, joining |
| `OptionalDemo` | `of`, `empty`, `map`, `orElse`, `orElseGet`, `ifPresent` |
| `DefaultStaticInterfaceDemo` | Default + static methods on interfaces |
| `DateTimeApiDemo` | `LocalDate`, `LocalDateTime`, `Period`, formatters |
| *(create)* `StreamParallelDemo` | `parallelStream`, when it helps / hurts |
| *(create)* `CollectorsGroupingDemo` | `groupingBy`, `partitioningBy`, `counting` |

### `java8`

| Program | Idea |
|---------|------|
| `LambdaExpressionDemo` | `(a, b) -> ...` vs anonymous classes; Comparator lambda |
| `FunctionalInterfaceDemo` | Custom `@FunctionalInterface`; SAM; default methods on FI |
| `PredicateFunctionConsumerDemo` | `Predicate`, `Function`, `Consumer`, `Supplier` |
| `BiFunctionUnaryOperatorDemo` | `BiFunction`, `BinaryOperator`, `UnaryOperator`, `BiPredicate` |
| `MethodReferenceDemo` | `Class::method`, `instance::method`, constructor refs |
| `StreamBasicsDemo` | `filter`, `map`, `distinct`, `collect` |
| `StreamReduceCollectDemo` | `reduce`, `max`/`min`, `findFirst`, joining |
| `OptionalDemo` | `of`, `empty`, `map`, `orElse`, `orElseGet`, `ifPresent` |
| `DefaultStaticInterfaceDemo` | Default + static methods on interfaces |
| `DateTimeApiDemo` | `LocalDate`, `LocalDateTime`, `Period`, formatters |
| *(create)* `StreamParallelDemo` | `parallelStream`, when it helps / hurts |
| *(create)* `CollectorsGroupingDemo` | `groupingBy`, `partitioningBy`, `counting` |

### `collections`

| Subpackage | Programs |
|------------|----------|
| `list/` | Reverse list; merge two sorted lists; rotate; find duplicate |
| `map/` | Frequency count; two-sum with HashMap; LRU sketch with LinkedHashMap |
| `set/` | Remove duplicates; union/intersection of two sets |
| `deque/` | Sliding window max (Deque); palindrome check with Deque |
| `stack/` | Valid parentheses; evaluate postfix; min stack |
| `treeset/` | Sort custom objects; range queries; ceiling/floor |
| `sorting/` | `Comparable` vs `Comparator`; sort map by value |
| `iterators/` | Fail-fast demo; `ListIterator` bidirectional |

## `practice-programs/` — interview coding drills

Separate folder with **empty templates** (requirement in Javadoc, no solution). See `practice-programs/README.md` for the full list.

```bash
mvn -q compile exec:java -Dexec.mainClass=Fibonacci
```

## Git workflow

```bash
cd java-practice-programs
git init
git add .
git commit -m "chore: scaffold java practice programs project"
# add remote and push when ready
git remote add origin <your-repo-url>
git push -u origin main
```

Commit one exercise at a time, e.g. `feat(collections): valid parentheses with stack`.

## Tips

- Keep each exercise in its own class with `main` for quick runs.
- Add `src/test/java/...` JUnit tests when you want to verify edge cases.
- For `java7` / `java8` packages: names reflect **language features by version**; project compiles with JDK 17.
