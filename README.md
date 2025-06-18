![docs](./docs/kick-the-java-logo.png)

이 리포지토리는 자바의 기초 문법부터 최신 릴리즈 기능까지 폭넓게 학습하고 실험하기 위한 공간이다

평소에 사용하지 않는 패키지나, 자주 사용되는 패턴, 최신 프로젝트들(Project Loom, Project Panama 등)의 실험적인 기능까지 자바를 탐험하며 학습하고 직접 코드를 통해 검증하는 것을 목표로 한다


## 다루는 내용 및 모듈 구성

주제별로 그레이들 멀티 모듈 프로젝트로 구성되어 있다

| 주제                  | 모듈                               | 내용                                                                                                                         |
|---------------------|----------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| **문법**              | [lang](./lang)                   | 타입(클래스, Enum, Sealed Class 등), var, 제네릭, 패턴 매칭, 텍스트 블록, instanceof/스위치 개선 등                                                |
| **컬렉션 프레임워크**       | [collections](./collections)     | List/Set/Map/Queue/Deque, Immutable Collections, Concurrent Collections, SequencedCollection                               |
| **함수형 프로그래밍**       | [functional](./functional)       | 람다식, 스트림(Gatherer), Optional, 함수형 인터페이스                                                                                    |
| **멀티스레딩 & 동시성**     | [thread](./thread)               | Thread, ExecutorService, volatile, ReentrantLock, CompletableFuture, ForkJoinPool, Virtual Threads, Structured Concurrency |
| **JVM & 네이티브**      | [jvm](./jvm), [native](./native) | 클래스 로딩/클래스패스, 바이트코드 분석, GC 전략, JVM 옵션, JIT/AOT, GraalVM, 네이티브 이미지                                                          |
| **입출력**             | [io](./io)                       | InputStream/OutputStream, Reader/Writer, nio, Memory-mapped I/O, Buffered vs Unbuffered, Stream + I/O                      |
| **네트워크**            | [network](./network)             | Socket, ServerSocket, HttpURLConnection, HttpClient, Jackson, WebSocket                                                    |
| **FFI**             | [foreign](./foreign)             | JNI, Project Panama 기반 FFI, MemorySegment, MemoryLayout, Linker, SymbolLookup                                              |
| **유틸리티**            | [utils](./utils)                 | 날짜/시간, 문자열 처리, 로그 처리 등                                                                                                     |
| **보안**              | [security](./security)           | MessageDigest, Signature, KeyPairGenerator, Cipher, AES/PSA                                                                |
| **도구**              | [tools](./tools)                  | JMeter, Checkstyle, SonarQube, JVisualVM, JMC, JFR, JShell                                                                 |
| **실험 프로젝트 및 프리뷰 기능** | [experimental](./experimental)   | Project Amber / Loom / Panama / Valhalla / Leyden / Galahad / ZGC / Shenandoah                                             |

