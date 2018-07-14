package com.c3s.core.service;

/**
 * This interface contains common services for all modules
 * @author C3S
 *
 */
public interface ICommonService {

	/**
	 * Save a mapped entity
	 * @param model
	 */
	public void saveModel(Object model);

	/**
	 * update a mapped entity
	 * @param model
	 */
	public void updateModel(Object model);

	/**
	 * delete a mapped entity
	 * @param model
	 */
	public void deleteModel(Object model);
}
