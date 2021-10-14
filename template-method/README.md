# Template Method Pattern

## 1. Template Method Pattern 이란?

- 상위 클래스에서는 전체적인 흐름을 구현하고 구체적인 처리는 하위 클래스에 위임

![templte_method](etc/templte_method.png)

## 2. 의도 (Intent)와 동기(Motivation)

- Operation 에  알고리즘의 기본 골격 구조를 정의하고 구체적인 단계는 서브클래스에 정의한다

- 추상화된 함수를 통해서 알고리즘의 일부 단계를 정의함으로써 템플릿 메소드의 처리순서를 정할 수 있다.

## 3. Class diagram

![template_method_urm](etc/template_method_urm.png)

## 4. 객체 협력 (collaborations)

- **AbstractClass**

서브 클래스들이 반드시 구현해야 하는 알고리즘 처리 단계 내의 기본 오퍼레이션이 무엇인지를 정의한다. 서브 클래스에서 이들 오퍼레이션들을 구현한다.

- **ConcreteClass**

상위 클래스에서 선언된 추상 메서드를 구현하거나 이미 구현된 메서드를 재정의한다

## 5. 중요한 결론 (consequence)

- 템플릿 메소드는 코드 재사용을 위한 기본 기술

- 프레임워크에서 가장 많이 사용되는 패턴 중 하나

- 클래스의 공통부분을 분리하는 기능 제공

- 템플릿 메서드에서 사용하는 오퍼레이션들

  ConcreteClass  오퍼레이션이나 클라이언트 클래스에 정의된 오퍼레이션

  AbstractClass 에 정의된 오퍼레이션 중 구체적인 알고리즘을 가지고 있는 오퍼레이션

  기본 오퍼레이션으로 추상화된 오퍼레이션

  훅 오퍼레이션


