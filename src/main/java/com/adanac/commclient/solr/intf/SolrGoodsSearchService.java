package com.adanac.commclient.solr.intf;

import java.util.Map;

import com.adanac.commclient.solr.dto.SolrGoodsDto;
import com.adanac.framework.page.Pager;
import com.adanac.framework.page.PagerParam;

public interface SolrGoodsSearchService {

	/**
	 * 
	 * 指定查询条件进行solr的商品数据查询
	 * @param map
	 * @param param
	 * @return
	 */
	public Pager<SolrGoodsDto> searchGoods(Map<String, Object> map, PagerParam param);

	/**
	 * 
	 * 指定查询条件进行solr的商品数据查询:涉及引进挂靠
	 * @param map
	 * @param param
	 * @param anchoredType  AnchoredTypeEnum
	 * @return
	 */
	public Pager<SolrGoodsDto> searchGoods(Map<String, Object> map, PagerParam param, int anchoredType);

	/**
	 * 只查询商家的商品
	 * 指定查询条件进行solr的商品数据查询:涉及引进挂靠
	 * @param map
	 * @param param
	 * @param anchoredType  AnchoredTypeEnum
	 * @return
	 */
	public Pager<SolrGoodsDto> searchSuppGoods(Map<String, Object> map, PagerParam param, int anchoredType);

	/**
	 * 单铺通使用方法
	 * 
	 * @param companyId
	 * @param barCode
	 * @param goodsName
	 * @param desc
	 * @param skuId
	 * @param param
	 * @return
	 */
	public Pager<SolrGoodsDto> searchGoods(String companyId, String barCode, String goodsName, String desc,
			String skuId, PagerParam param);

	/**
	 * 根据传入的字段，判断是否在商品中使用
	 * @param map
	 * @return
	 */
	public boolean chkIsUsed(Map<String, Object> map);

	/**
	 * 查询供应商指定条码下的商品
	 * @param fcooperatorId 供应商Id (为空查询所有)
	 * @param barCode	条码
	 * @return
	 */
	public Pager<SolrGoodsDto> queryGoodsByBarCode(String barCode, String cooperatorId, PagerParam param);

	/**
	 * 根据条码查询是否存在平台商品
	 * @param fcooperatorId 供应商Id(为空查询所有)
	 * @param barCode	条码 
	 * @return true 已存在 false 不存在
	 */
	public Boolean checkBarCode(String barCode, String cooperatorId);

	/**
	 *  根据Skuid查询商品
	 * @param skuId
	 * @return
	 */
	public SolrGoodsDto getBySkuId(String skuId);

}
