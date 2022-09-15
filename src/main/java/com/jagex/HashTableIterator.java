package com.jagex;

import java.util.Iterator;

public class HashTableIterator implements Iterator {

	public static boolean hasValues() {
		ReflectionCheck checks = (ReflectionCheck) Class435.PENDING_REFLECTION_CHECKS.head();
		return checks != null;
	}

	static CutsceneActionType[] method7519() {
		return new CutsceneActionType[]{CutsceneActionType.aClass411_4928, CutsceneActionType.aClass411_4952, CutsceneActionType.aClass411_4939, CutsceneActionType.aClass411_4954, CutsceneActionType.aClass411_4942, CutsceneActionType.aClass411_4948, CutsceneActionType.aClass411_4941, CutsceneActionType.aClass411_4953, CutsceneActionType.aClass411_4934, CutsceneActionType.aClass411_4926, CutsceneActionType.aClass411_4951, CutsceneActionType.aClass411_4930, CutsceneActionType.aClass411_4935, CutsceneActionType.aClass411_4946, CutsceneActionType.aClass411_4927, CutsceneActionType.aClass411_4944, CutsceneActionType.aClass411_4943, CutsceneActionType.aClass411_4931, CutsceneActionType.aClass411_4949, CutsceneActionType.aClass411_4940, CutsceneActionType.aClass411_4936, CutsceneActionType.aClass411_4947, CutsceneActionType.aClass411_4925, CutsceneActionType.aClass411_4929, CutsceneActionType.aClass411_4955, CutsceneActionType.aClass411_4950, CutsceneActionType.aClass411_4937, CutsceneActionType.aClass411_4932, CutsceneActionType.aClass411_4933, CutsceneActionType.aClass411_4938, CutsceneActionType.aClass411_4945};
	}

	Node aNode_5441;

	IterableNodeMap aClass465_5439;

	int anInt5442;

	Node aNode_5440;

	public HashTableIterator(IterableNodeMap iterablenodemap_1) {
		aClass465_5439 = iterablenodemap_1;
		method7512();
	}

	public Node first() {
		method7512();
		return (Node) next();
	}

	@Override
	public boolean hasNext() {
		if (aClass465_5439.nodes[anInt5442 - 1] != aNode_5440)
			return true;
		while (anInt5442 < aClass465_5439.size) {
			if (aClass465_5439.nodes[++anInt5442 - 1].next != aClass465_5439.nodes[anInt5442 - 1]) {
				aNode_5440 = aClass465_5439.nodes[anInt5442 - 1].next;
				return true;
			}
			aNode_5440 = aClass465_5439.nodes[anInt5442 - 1];
		}
		return false;
	}

	void method7512() {
		aNode_5440 = aClass465_5439.nodes[0].next;
		anInt5442 = 1;
		aNode_5441 = null;
	}

	@Override
	public Object next() {
		Node node_1;
		if (aClass465_5439.nodes[anInt5442 - 1] != aNode_5440) {
			node_1 = aNode_5440;
			aNode_5440 = node_1.next;
			aNode_5441 = node_1;
			return node_1;
		}
		while (anInt5442 < aClass465_5439.size) {
			node_1 = aClass465_5439.nodes[++anInt5442 - 1].next;
			if (node_1 != aClass465_5439.nodes[anInt5442 - 1]) {
				aNode_5440 = node_1.next;
				aNode_5441 = node_1;
				return node_1;
			}
		}
		return null;
	}

	@Override
	public void remove() {
		if (aNode_5441 == null)
			throw new IllegalStateException();
		aNode_5441.unlink();
		aNode_5441 = null;
	}
}
