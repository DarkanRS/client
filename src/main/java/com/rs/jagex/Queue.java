package com.rs.jagex;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
	static int anInt5630;
	static ParticleSystem[] aClass539Array5632;
	public static void loadFontArchiveIds(Index index_0) {
		Class16.p11FullIndex = index_0.getArchiveId("p11_full");
		Class16.p12FullIndex = index_0.getArchiveId("p12_full");
		Class395.b12FullIndex = index_0.getArchiveId("b12_full");
	}
	public CacheableNode aCacheableNode_5629 = new CacheableNode();

	CacheableNode aCacheableNode_5631;

	public Queue() {
		aCacheableNode_5629.aCacheableNode_8119 = aCacheableNode_5629;
		aCacheableNode_5629.current = aCacheableNode_5629;
	}

	public void add(CacheableNode cacheablenode_1) {
		if (cacheablenode_1.current != null)
			cacheablenode_1.method13452();
		cacheablenode_1.current = aCacheableNode_5629.current;
		cacheablenode_1.aCacheableNode_8119 = aCacheableNode_5629;
		cacheablenode_1.current.aCacheableNode_8119 = cacheablenode_1;
		cacheablenode_1.aCacheableNode_8119.current = cacheablenode_1;
	}

	@Override
	public Iterator iterator() {
		return new Class469(this);
	}

	public void method7935() {
		while (aCacheableNode_5629.aCacheableNode_8119 != aCacheableNode_5629)
			aCacheableNode_5629.aCacheableNode_8119.method13452();
	}

	public CacheableNode method7937() {
		CacheableNode cacheablenode_2 = aCacheableNode_5629.aCacheableNode_8119;
		if (cacheablenode_2 == aCacheableNode_5629)
			return null;
		cacheablenode_2.method13452();
		return cacheablenode_2;
	}

	public CacheableNode method7941() {
		return method7946(null);
	}

	CacheableNode method7946(CacheableNode cacheablenode_1) {
		CacheableNode cacheablenode_3;
		if (cacheablenode_1 == null)
			cacheablenode_3 = aCacheableNode_5629.aCacheableNode_8119;
		else
			cacheablenode_3 = cacheablenode_1;
		if (cacheablenode_3 == aCacheableNode_5629) {
			aCacheableNode_5631 = null;
			return null;
		}
		aCacheableNode_5631 = cacheablenode_3.aCacheableNode_8119;
		return cacheablenode_3;
	}

	public CacheableNode method7955() {
		CacheableNode cacheablenode_2 = aCacheableNode_5631;
		if (cacheablenode_2 == aCacheableNode_5629) {
			aCacheableNode_5631 = null;
			return null;
		}
		aCacheableNode_5631 = cacheablenode_2.aCacheableNode_8119;
		return cacheablenode_2;
	}

	public int size() {
		int i_2 = 0;
		for (CacheableNode cacheablenode_3 = aCacheableNode_5629.aCacheableNode_8119; cacheablenode_3 != aCacheableNode_5629; cacheablenode_3 = cacheablenode_3.aCacheableNode_8119)
			++i_2;
		return i_2;
	}
}
